package com.insat.auctionsale.common.dto;

public class CategoryDto {

	private Integer id;
	private String name;
	private Long rate;
	private CategoryDto parentCategoryDto;

	public CategoryDto() {
		super();
	}

	public CategoryDto(String name, Long rate) {
		super();
		this.name = name;
		this.rate = rate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getRate() {
		return rate;
	}

	public void setRate(Long rate) {
		this.rate = rate;
	}

	public CategoryDto getParentCategoryDto() {
		return parentCategoryDto;
	}

	public void setParentCategoryDto(CategoryDto parentCategoryDto) {
		this.parentCategoryDto = parentCategoryDto;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
