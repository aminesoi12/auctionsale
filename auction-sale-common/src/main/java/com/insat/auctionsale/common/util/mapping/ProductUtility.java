package com.insat.auctionsale.common.util.mapping;

import java.util.ArrayList;
import java.util.List;

import com.insat.auctionsale.common.dto.CategoryDto;
import com.insat.auctionsale.common.dto.ProductDto;
import com.insat.auctionsale.common.entity.ProductEntity;

public class ProductUtility {

	public static ProductDto convertEntityToDto(ProductEntity productEntity)
	{
		ProductDto productDto=new ProductDto();
		productDto.setDescription(productEntity.getDescription());
		productDto.setIsAuctionClosed(productEntity.getIsAuctionClosed());
		productDto.setName(productEntity.getName());
		return productDto;
	}
	
	public static List<ProductDto> convertEntityToDto(List<ProductEntity> productEntities)
	{
		
		List<ProductDto> productsDtos=new ArrayList<ProductDto>();
		for(ProductEntity productEntity:productEntities){
		ProductDto productDto=new ProductDto();
		productDto.setDescription(productEntity.getDescription());
		productDto.setIsAuctionClosed(productEntity.getIsAuctionClosed());
		productDto.setName(productEntity.getName());
		CategoryDto categoryDto=new CategoryDto();
		categoryDto.setName(productEntity.getCategory().getName());
		categoryDto.setRate(productEntity.getCategory().getRate());
		productDto.setCategory(categoryDto);
		productsDtos.add(productDto);
		}
		
		return productsDtos;
	}
	
	public static ProductEntity convertEntityToDto(ProductDto productDto)
	{
		ProductEntity productEntity=new ProductEntity();
		productEntity.setDescription(productDto.getDescription());
		productEntity.setIsAuctionClosed(productDto.getIsAuctionClosed());
		productEntity.setName(productDto.getName());
		return productEntity;
	}
}
