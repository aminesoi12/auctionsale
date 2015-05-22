package com.insat.auctionsale.common.dto;

import java.util.List;

public class CategoryDto {
	
	private String name;
	private Long rate;
	private List<CategoryDto> categories;
	private List<ProductDto> products;
	
	
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
	public List<CategoryDto> getCategories() {
		return categories;
	}
	public void setCategories(List<CategoryDto> categories) {
		this.categories = categories;
	}
	public List<ProductDto> getProducts() {
		return products;
	}
	public void setProducts(List<ProductDto> products) {
		this.products = products;
	}
	
}
