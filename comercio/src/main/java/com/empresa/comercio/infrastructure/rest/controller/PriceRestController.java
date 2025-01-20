package com.empresa.comercio.infrastructure.rest.controller;

import com.empresa.comercio.common.DateUtils;
import com.empresa.comercio.common.PriceDto;
import com.empresa.comercio.domain.model.Price;
import com.empresa.comercio.usecase.IPriceFinderInteractor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@RequestMapping("/comercio/prices")
@RestController
public class PriceRestController {

    private final IPriceFinderInteractor priceFinderInteractor;

    @GetMapping("/price")
    public PriceDto findPrice(String fecha, Long productId, Long brandId) {
    	
    	System.out.println("Fecha: " + fecha);
    	
    	LocalDateTime fecha2 = DateUtils.convertToLocalDateTime(fecha);
        Price price = priceFinderInteractor.findPrice(fecha2,productId,brandId);
        return PriceMapper.fromPriceToPriceDto(price);
    }

    @GetMapping("/{id}")
    public PriceDto findPriceById(@PathVariable Long id) {
        Price price = priceFinderInteractor.findById(id);
        return PriceMapper.fromPriceToPriceDto(price);
    }

}
