package com.insat.auctionsale.core.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insat.auctionsale.common.entity.CategoryEntity;

@Repository(value="categoryEntityRepository")
public interface CategoryEntityRepository extends JpaRepository<CategoryEntity, Integer> {

	
}