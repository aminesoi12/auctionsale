package com.insat.auctionsale.common.enumeration;

public enum LanguageEnum {

	FR("Francais"),EN("English");
	
	private String language;
	
	private LanguageEnum(String language)
	{
		this.language=language;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
}
