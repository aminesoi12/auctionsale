package com.insat.auctionsale.core.service;

import java.util.List;

import com.insat.auctionsale.common.dto.CategoryDto;

public interface ProductManagementService {
	public List<CategoryDto> findRootCategories();
	public List<CategoryDto> findSubCategoriesByCategoryId(Integer id);
}
