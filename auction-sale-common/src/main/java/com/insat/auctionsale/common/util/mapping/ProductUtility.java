package com.insat.auctionsale.common.util.mapping;

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
	
	public static ProductEntity convertEntityToDto(ProductDto productDto)
	{
		ProductEntity productEntity=new ProductEntity();
		productEntity.setDescription(productDto.getDescription());
		productEntity.setIsAuctionClosed(productDto.getIsAuctionClosed());
		productEntity.setName(productDto.getName());
		return productEntity;
	}
}
