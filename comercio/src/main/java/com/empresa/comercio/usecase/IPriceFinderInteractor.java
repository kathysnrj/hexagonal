package com.empresa.comercio.usecase;

import com.empresa.comercio.domain.model.Price;

import java.time.LocalDateTime;

public interface IPriceFinderInteractor {

    Price findPrice(LocalDateTime fecha, Long productId, Long brandId);

    Price findById(Long id);
}
