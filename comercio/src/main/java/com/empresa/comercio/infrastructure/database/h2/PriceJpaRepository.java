package com.empresa.comercio.infrastructure.database.h2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.Optional;

public interface PriceJpaRepository extends JpaRepository<PriceEntity, Long> {

	@Query("SELECT P FROM PriceEntity P WHERE :fecha Between P.startDate AND P.endDate AND P.productId = :productId AND P.brandId = :brandId")
	Optional<PriceEntity> findPrice(LocalDateTime fecha, Long productId, Long brandId);

	@Query(value = "SELECT * FROM prices " 
			+ "WHERE :fecha BETWEEN start_date AND end_date "
			+ "AND product_id = :productId " 
			+ "AND brand_id = :brandId " 
			+ "ORDER BY price ASC "
			+ "LIMIT 1", nativeQuery = true)
	Optional<PriceEntity> findLowestPriceNative(@Param("fecha") LocalDateTime fecha, @Param("productId") Long productId,
			@Param("brandId") Long brandId);
}
