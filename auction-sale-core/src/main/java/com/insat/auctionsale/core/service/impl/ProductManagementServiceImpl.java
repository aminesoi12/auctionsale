package com.insat.auctionsale.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insat.auctionsale.common.dto.CategoryDto;
import com.insat.auctionsale.common.dto.ProductDto;
import com.insat.auctionsale.common.entity.CategoryEntity;
import com.insat.auctionsale.common.entity.ProductEntity;
import com.insat.auctionsale.common.util.mapping.CategoryUtility;
import com.insat.auctionsale.common.util.mapping.ProductUtility;
import com.insat.auctionsale.core.dao.CategoryEntityRepository;
import com.insat.auctionsale.core.dao.ProductEntityRepository;
import com.insat.auctionsale.core.service.ProductManagementService;

@Service("productManagementService")
public class ProductManagementServiceImpl implements ProductManagementService{

	@Autowired
	CategoryEntityRepository categoryEntityRepository;
	
	
	@Autowired
	ProductEntityRepository productEntityRepository; 
	
	public List<CategoryDto> findRootCategories()
	{
		List<CategoryEntity> categoriesEntities=categoryEntityRepository.findRootProductCategories();
		return CategoryUtility.convertEntityToDto(categoriesEntities);
	}
	public List<CategoryDto> findSubCategoriesByCategoryId(Integer id)
	{
		List<CategoryEntity> categoriesEntities=categoryEntityRepository.findSubCategoriesById(id);
		return CategoryUtility.convertEntityToDto(categoriesEntities);
	}
	
	public List<ProductDto> findProductsOnAuctionSale()
	{
		List<ProductEntity> products=productEntityRepository.findProductsOnAuction();
		return ProductUtility.convertEntityToDto(products);
	}
	
	public List<ProductDto> findUserProducts(String login)
	{
		List<ProductEntity> products=productEntityRepository.findUserProducts(login);
		return ProductUtility.convertEntityToDto(products);
	}
	
	public void addProduct(String name, String description)
	{
		ProductEntity productEntity=new ProductEntity();
		productEntity.setName(name);
		productEntity.setName(description);
		productEntityRepository.save(productEntity);
	}
	
}
