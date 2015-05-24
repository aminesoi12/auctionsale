package com.insat.auctionsale.web.bean.admin.model;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.insat.auctionsale.common.dto.ProductDto;
import com.insat.auctionsale.core.service.ProductManagementService;

@Component("userProductModelBean")
@Scope("view")
public class UserProductModelBean {

	private List<ProductDto> userProducts;

	@Autowired
	ProductManagementService productManagementService;
	
	@PostConstruct
	public void init()
	{
		//userProducts=productManagementService.findUserProducts(login);
	}

	public List<ProductDto> getUserProducts() {
		return userProducts;
	}

	public void setUserProducts(List<ProductDto> userProducts) {
		this.userProducts = userProducts;
	}

	public ProductManagementService getProductManagementService() {
		return productManagementService;
	}

	public void setProductManagementService(
			ProductManagementService productManagementService) {
		this.productManagementService = productManagementService;
	}

	
}
