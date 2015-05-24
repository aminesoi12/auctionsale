package com.insat.auctionsale.common.enumeration;

public enum ProductTypeEnum {

	All_PRODUCT("AllProducts"),USER_PRODUCT("UserProducts");
	
	private String type;

	private ProductTypeEnum(String type)
	{
		this.type=type;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
