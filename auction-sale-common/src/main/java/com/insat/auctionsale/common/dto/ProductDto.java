package com.insat.auctionsale.common.dto;

import java.util.List;

public class ProductDto {
	
	private String description;
	private Boolean isAuctionClosed;
	private String name;
	private AppUserDto appUser;
	private CategoryDto category;
	private List<ProposalDto> proposals;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getIsAuctionClosed() {
		return isAuctionClosed;
	}

	public void setIsAuctionClosed(Boolean isAuctionClosed) {
		this.isAuctionClosed = isAuctionClosed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AppUserDto getAppUser() {
		return appUser;
	}

	public void setAppUser(AppUserDto appUser) {
		this.appUser = appUser;
	}

	public CategoryDto getCategory() {
		return category;
	}

	public void setCategory(CategoryDto category) {
		this.category = category;
	}

	public List<ProposalDto> getProposals() {
		return proposals;
	}

	public void setProposals(List<ProposalDto> proposals) {
		this.proposals = proposals;
	}

}
