package com.insat.auctionsale.common.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the product database table.
 * 
 */
@Entity
@Table(name="product")
@NamedQuery(name="ProductEntity.findAll", query="SELECT p FROM ProductEntity p")
public class ProductEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="creation_date")
	private Date creationDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="END_AUCTION_DATE")
	private Date endAuctionDate;
	
	private String description;

	@Column(name="is_auction_closed")
	private Boolean isAuctionClosed;

	private String name;

	//bi-directional many-to-one association to AppUserEntity
	@ManyToOne
	@JoinColumn(name="user_login")
	private AppUserEntity appUser;

	//bi-directional many-to-one association to CategoryEntity
	@ManyToOne
	private CategoryEntity category;

	//bi-directional many-to-one association to ProposalEntity
	@OneToMany(mappedBy="product")
	private List<ProposalEntity> proposals;

	public ProductEntity() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	public Date getEndAuctionDate() {
		return endAuctionDate;
	}

	public void setEndAuctionDate(Date endAuctionDate) {
		this.endAuctionDate = endAuctionDate;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getIsAuctionClosed() {
		return this.isAuctionClosed;
	}

	public void setIsAuctionClosed(Boolean isAuctionClosed) {
		this.isAuctionClosed = isAuctionClosed;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AppUserEntity getAppUser() {
		return this.appUser;
	}

	public void setAppUser(AppUserEntity appUser) {
		this.appUser = appUser;
	}

	public CategoryEntity getCategory() {
		return this.category;
	}

	public void setCategory(CategoryEntity category) {
		this.category = category;
	}

	public List<ProposalEntity> getProposals() {
		return this.proposals;
	}

	public void setProposals(List<ProposalEntity> proposals) {
		this.proposals = proposals;
	}

	public ProposalEntity addProposal(ProposalEntity proposal) {
		getProposals().add(proposal);
		proposal.setProduct(this);

		return proposal;
	}

	public ProposalEntity removeProposal(ProposalEntity proposal) {
		getProposals().remove(proposal);
		proposal.setProduct(null);

		return proposal;
	}

}