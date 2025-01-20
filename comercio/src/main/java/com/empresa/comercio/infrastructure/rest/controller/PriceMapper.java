package com.empresa.comercio.infrastructure.rest.controller;

import com.empresa.comercio.common.PriceDto;
import com.empresa.comercio.domain.model.Price;

public class PriceMapper {
    public static PriceDto fromPriceToPriceDto(Price price) {
        return new PriceDto(
            price.getBrandId(),
            price.getProductId(),
            price.getPrice(),
            price.getStartDate(),
            price.getEndDate()
        );
    }
}
