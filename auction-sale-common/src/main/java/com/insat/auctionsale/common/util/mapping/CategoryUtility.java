package com.insat.auctionsale.common.util.mapping;

import java.util.ArrayList;
import java.util.List;

import com.insat.auctionsale.common.dto.CategoryDto;
import com.insat.auctionsale.common.entity.CategoryEntity;

public class CategoryUtility {

	public static CategoryDto convertEntityToDto(CategoryEntity categoryEntity) {
		CategoryDto categoryDto = new CategoryDto();
		categoryDto.setId(categoryEntity.getId());
		categoryDto.setName(categoryEntity.getName());
		categoryDto.setRate(categoryEntity.getRate());
		return categoryDto;
	}
	
	public static List<CategoryDto> convertEntityToDto(List<CategoryEntity> categoryEntities) {
		List<CategoryDto> categoryDtos=new ArrayList<CategoryDto>();
		
		for(CategoryEntity categoryEntity:categoryEntities)
		{
		CategoryDto categoryDto = new CategoryDto();
		categoryDto.setId(categoryEntity.getId());
		categoryDto.setName(categoryEntity.getName());
		categoryDto.setRate(categoryEntity.getRate());
		categoryDtos.add(categoryDto);
		}
		return categoryDtos;
	}
	
	public static CategoryEntity convertDtoToEntity(CategoryDto categoryDto) {
		CategoryEntity categoryEntity = new CategoryEntity();
		categoryEntity.setName(categoryDto.getName());
		categoryEntity.setRate(categoryDto.getRate());
		return categoryEntity;
	}

}
