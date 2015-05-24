package com.insat.auctionsale.web.bean.admin.model;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.insat.auctionsale.common.dto.ProductDto;
import com.insat.auctionsale.core.service.ProductManagementService;


@Component("productOnAuctionModelBean")
@Scope("view")
public class ProductOnAuctionModelBean {

	private List<ProductDto> productsOnAuction;

	@Autowired
	ProductManagementService productManagementService;
	
	@PostConstruct
	public void init()
	{
		productsOnAuction=productManagementService.findProductsOnAuctionSale();
	}
	
	public List<ProductDto> findProducts(){
		return productManagementService.findProductsOnAuctionSale();
	}
	
	public List<ProductDto> getProductsOnAuction() {
		return productsOnAuction;
	}

	public void setProductsOnAuction(List<ProductDto> productsOnAuction) {
		this.productsOnAuction = productsOnAuction;
	}
	
}
