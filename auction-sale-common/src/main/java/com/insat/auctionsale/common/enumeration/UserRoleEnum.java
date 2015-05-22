package com.insat.auctionsale.common.enumeration;

public enum UserRoleEnum {
	
	ADMIN("ADMIN"),USER("USER");
	
	private String name;
	
	private UserRoleEnum(String name)
	{
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
