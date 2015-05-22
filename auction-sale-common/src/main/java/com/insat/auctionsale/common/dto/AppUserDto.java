package com.insat.auctionsale.common.dto;

import java.util.List;

public class AppUserDto {
	
	private String login;
	private String firstName;
	private Boolean isEnabled;
	private String lastName;
	private String password;
	private List<ProductDto> products;
	private List<ProposalDto> proposals;
	private List<UserRoleDto> userRoles;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public Boolean getIsEnabled() {
		return isEnabled;
	}
	public void setIsEnabled(Boolean isEnabled) {
		this.isEnabled = isEnabled;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<ProductDto> getProducts() {
		return products;
	}
	public void setProducts(List<ProductDto> products) {
		this.products = products;
	}
	public List<ProposalDto> getProposals() {
		return proposals;
	}
	public void setProposals(List<ProposalDto> proposals) {
		this.proposals = proposals;
	}
	public List<UserRoleDto> getUserRoles() {
		return userRoles;
	}
	public void setUserRoles(List<UserRoleDto> userRoles) {
		this.userRoles = userRoles;
	}
	
}
