package com.insat.auctionsale.core.service;

import java.util.List;

import com.insat.auctionsale.common.dto.CategoryDto;
import com.insat.auctionsale.common.dto.ProductDto;

public interface ProductManagementService {
	public List<CategoryDto> findRootCategories();
	public List<CategoryDto> findSubCategoriesByCategoryId(Integer id);
	public List<ProductDto> findProductsOnAuctionSale();
	public List<ProductDto> findUserProducts(String login);
	public void addProduct(String name, String description);
}
