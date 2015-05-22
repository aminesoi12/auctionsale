package com.insat.auctionsale.core.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insat.auctionsale.common.entity.ProductEntity;

@Repository(value="productEntityRepository")
public interface ProductEntityRepository extends JpaRepository<ProductEntity, Integer> {

	
}