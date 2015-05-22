package com.insat.auctionsale.common.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the proposal database table.
 * 
 */
@Entity
@Table(name="proposal")
@NamedQuery(name="ProposalEntity.findAll", query="SELECT p FROM ProposalEntity p")
public class ProposalEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String comment;

	@Column(name="creation_date")
	private Timestamp creationDate;

	private Long value;

	//bi-directional many-to-one association to AppUserEntity
	@ManyToOne
	@JoinColumn(name="user_login")
	private AppUserEntity appUser;

	//bi-directional many-to-one association to ProductEntity
	@ManyToOne
	private ProductEntity product;

	public ProposalEntity() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Timestamp getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}

	public Long getValue() {
		return this.value;
	}

	public void setValue(Long value) {
		this.value = value;
	}

	public AppUserEntity getAppUser() {
		return this.appUser;
	}

	public void setAppUser(AppUserEntity appUser) {
		this.appUser = appUser;
	}

	public ProductEntity getProduct() {
		return this.product;
	}

	public void setProduct(ProductEntity product) {
		this.product = product;
	}

}