package com.empresa.comercio.infrastructure.database.h2;

import com.empresa.comercio.domain.model.Price;

import java.util.Optional;

public class PriceEntityMapper {

    public static Price fromPriceEntityToPrice(PriceEntity priceEntity) {
        return new Price(
                priceEntity.getId(),
                priceEntity.getBrandId(),
                priceEntity.getStartDate(),
                priceEntity.getEndDate(),
                priceEntity.getPriceList(),
                priceEntity.getProductId(),
                priceEntity.getPriority(),
                priceEntity.getPrice(),
                priceEntity.getCurrency()
        );
    }

}
