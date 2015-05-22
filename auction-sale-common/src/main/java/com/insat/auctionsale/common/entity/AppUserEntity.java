package com.insat.auctionsale.common.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the app_user database table.
 * 
 */
@Entity
@Table(name="app_user")
@NamedQuery(name="AppUserEntity.findAll", query="SELECT a FROM AppUserEntity a")
public class AppUserEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String login;

	@Column(name="creation_date")
	private Timestamp creationDate;

	@Column(name="first_name")
	private String firstName;

	@Column(name="is_enabled")
	private Boolean isEnabled;

	@Column(name="last_name")
	private String lastName;

	private String password;

	//bi-directional many-to-one association to ProductEntity
	@OneToMany(mappedBy="appUser")
	private List<ProductEntity> products;

	//bi-directional many-to-one association to ProposalEntity
	@OneToMany(mappedBy="appUser")
	private List<ProposalEntity> proposals;

	//bi-directional many-to-one association to UserRoleEntity
	@OneToMany(mappedBy="appUser")
	private List<UserRoleEntity> userRoles;

	public AppUserEntity() {
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public Timestamp getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Boolean getIsEnabled() {
		return this.isEnabled;
	}

	public void setIsEnabled(Boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<ProductEntity> getProducts() {
		return this.products;
	}

	public void setProducts(List<ProductEntity> products) {
		this.products = products;
	}

	public ProductEntity addProduct(ProductEntity product) {
		getProducts().add(product);
		product.setAppUser(this);

		return product;
	}

	public ProductEntity removeProduct(ProductEntity product) {
		getProducts().remove(product);
		product.setAppUser(null);

		return product;
	}

	public List<ProposalEntity> getProposals() {
		return this.proposals;
	}

	public void setProposals(List<ProposalEntity> proposals) {
		this.proposals = proposals;
	}

	public ProposalEntity addProposal(ProposalEntity proposal) {
		getProposals().add(proposal);
		proposal.setAppUser(this);

		return proposal;
	}

	public ProposalEntity removeProposal(ProposalEntity proposal) {
		getProposals().remove(proposal);
		proposal.setAppUser(null);

		return proposal;
	}

	public List<UserRoleEntity> getUserRoles() {
		return this.userRoles;
	}

	public void setUserRoles(List<UserRoleEntity> userRoles) {
		this.userRoles = userRoles;
	}

	public UserRoleEntity addUserRole(UserRoleEntity userRole) {
		getUserRoles().add(userRole);
		userRole.setAppUser(this);

		return userRole;
	}

	public UserRoleEntity removeUserRole(UserRoleEntity userRole) {
		getUserRoles().remove(userRole);
		userRole.setAppUser(null);

		return userRole;
	}

}