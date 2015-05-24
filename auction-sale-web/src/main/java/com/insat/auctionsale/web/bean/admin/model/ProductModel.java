package com.insat.auctionsale.web.bean.admin.model;

import org.primefaces.model.UploadedFile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("productModel")
@Scope("view")
public class ProductModel {
	
	private UploadedFile productImage;
	
	private String name;
	private String description;
	
	public UploadedFile getProductImage() {
		return productImage;
	}

	public void setProductImage(UploadedFile productImage) {
		this.productImage = productImage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
