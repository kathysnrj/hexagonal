package com.empresa.comercio.usecase;

import com.empresa.comercio.domain.model.Price;
import com.empresa.comercio.domain.repository.PriceRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Component
public class PriceFinderInteractor implements IPriceFinderInteractor {

    private final PriceRepositoryPort priceRepositoryPort;

    @Override
    public Price findPrice(LocalDateTime fecha, Long productId, Long brandId) {
    	System.out.println("Fecha2: " + fecha);
        return priceRepositoryPort.findPrice(fecha,productId,brandId);
    }

    @Override
    public Price findById(Long id) {
        return priceRepositoryPort.findById(id);
    }


}
