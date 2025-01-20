package com.empresa.comercio.infrastructure.database.h2;

import com.empresa.comercio.common.DateUtils;
import com.empresa.comercio.domain.model.Price;
import com.empresa.comercio.domain.repository.PriceRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.sql.Date;
import java.util.NoSuchElementException;

@RequiredArgsConstructor
@Component
public class PriceRepositoryAdapter implements PriceRepositoryPort {

    private final PriceJpaRepository priceJpaRepository;

    @Override
    public Price findPrice(LocalDateTime fecha, Long productId, Long brandId) {   	
        return priceJpaRepository.findLowestPriceNative(fecha, productId, brandId)
               .map(PriceEntityMapper::fromPriceEntityToPrice)
               .orElseThrow(() -> new NoSuchElementException("Price no found"));
    	//return new Price();
    }

    @Override
    public Price findById(Long id) {
        return priceJpaRepository.findById(id)
                .map(PriceEntityMapper::fromPriceEntityToPrice)
                .orElseThrow(() -> new NoSuchElementException("Price no found"));
    }
}
