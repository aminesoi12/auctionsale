package com.insat.auctionsale.common.dto;


public class UserRoleDto {
	
	private String role;
	private AppUserDto appUser;
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public AppUserDto getAppUser() {
		return appUser;
	}
	public void setAppUser(AppUserDto appUser) {
		this.appUser = appUser;
	}
	
}
