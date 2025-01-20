package com.empresa.comercio.common;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@EqualsAndHashCode
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PriceDto {

    private Long brandId;
    private Long productId;
    private BigDecimal price;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

}
