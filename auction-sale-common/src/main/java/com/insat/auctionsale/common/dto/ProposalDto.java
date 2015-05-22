package com.insat.auctionsale.common.dto;


public class ProposalDto {

	private String comment;
	private Long value;
	private AppUserDto appUser;
	private ProductDto product;
	
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Long getValue() {
		return value;
	}
	public void setValue(Long value) {
		this.value = value;
	}
	public AppUserDto getAppUser() {
		return appUser;
	}
	public void setAppUser(AppUserDto appUser) {
		this.appUser = appUser;
	}
	public ProductDto getProduct() {
		return product;
	}
	public void setProduct(ProductDto product) {
		this.product = product;
	}
}
