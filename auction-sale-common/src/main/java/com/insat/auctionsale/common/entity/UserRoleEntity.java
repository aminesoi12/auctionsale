package com.insat.auctionsale.common.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the user_role database table.
 * 
 */
@Entity
@Table(name="user_role")
@NamedQuery(name="UserRoleEntity.findAll", query="SELECT u FROM UserRoleEntity u")
public class UserRoleEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="creation_date")
	private Timestamp creationDate;

	private String role;

	//bi-directional many-to-one association to AppUserEntity
	@ManyToOne
	@JoinColumn(name="login")
	private AppUserEntity appUser;

	public UserRoleEntity() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Timestamp getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public AppUserEntity getAppUser() {
		return this.appUser;
	}

	public void setAppUser(AppUserEntity appUser) {
		this.appUser = appUser;
	}

}