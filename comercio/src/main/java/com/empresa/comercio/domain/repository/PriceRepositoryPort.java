package com.empresa.comercio.domain.repository;

import com.empresa.comercio.domain.model.Price;

import java.time.LocalDateTime;
import java.util.Optional;

public interface PriceRepositoryPort {
	
    Price findPrice(LocalDateTime fecha, Long productId, Long brandId);

    Price findById(Long id);
}
