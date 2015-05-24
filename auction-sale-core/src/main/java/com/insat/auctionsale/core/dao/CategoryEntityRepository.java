package com.insat.auctionsale.core.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.insat.auctionsale.common.entity.CategoryEntity;

@Repository(value="categoryEntityRepository")
public interface CategoryEntityRepository extends JpaRepository<CategoryEntity, Integer> {

	@Query("select c from CategoryEntity c where c.parentCategory is null")
	public List<CategoryEntity> findRootProductCategories();
	
	@Query("select c from CategoryEntity c where c.parentCategory.id=:id")
	public List<CategoryEntity> findSubCategoriesById(@Param("id")Integer id);
	
}