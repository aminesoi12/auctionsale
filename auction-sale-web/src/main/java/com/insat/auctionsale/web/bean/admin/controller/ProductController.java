package com.insat.auctionsale.web.bean.admin.controller;

import javax.faces.event.ActionEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.insat.auctionsale.core.service.ProductManagementService;
import com.insat.auctionsale.web.bean.admin.model.ProductModel;

@Component("productController")
@Scope("request")
public class ProductController {

	@Autowired
	ProductModel productModel;

	@Autowired
	ProductManagementService productManagementService;
	
	
	 public void addProduct(ActionEvent actionEvent) {
		 productManagementService.addProduct(productModel.getName(), productModel.getDescription());
	 }
}
