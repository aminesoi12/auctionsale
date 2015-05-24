package com.insat.auctionsale.web.bean.admin.model;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.insat.auctionsale.common.dto.CategoryDto;
import com.insat.auctionsale.core.service.ProductManagementService;

@Component("productCategoryModelBean")
@Scope("view")
public class ProductCategoryModelBean {
	
	private List<CategoryDto> categories;

	

	@Autowired
	ProductManagementService productManagementService;
	
	
	@PostConstruct
	public void init()
	{
	}
	
	
	public List<CategoryDto> getCategories() {
		return categories;
	}

	public void setCategories(List<CategoryDto> categories) {
		this.categories = categories;
	}



	
}
