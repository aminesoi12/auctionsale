package com.insat.auctionsale.common.util.mapping;

import com.insat.auctionsale.common.dto.CategoryDto;
import com.insat.auctionsale.common.entity.CategoryEntity;

public class CategoryUtility {

	public static CategoryDto convertEntityToDto(CategoryEntity categoryEntity) {
		CategoryDto categoryDto = new CategoryDto();
		categoryDto.setName(categoryEntity.getName());
		categoryDto.setRate(categoryEntity.getRate());
		return categoryDto;
	}
	
	public static CategoryEntity convertDtoToEntity(CategoryDto categoryDto) {
		CategoryEntity categoryEntity = new CategoryEntity();
		categoryEntity.setName(categoryDto.getName());
		categoryEntity.setRate(categoryDto.getRate());
		return categoryEntity;
	}

}
