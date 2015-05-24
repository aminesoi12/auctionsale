package com.insat.auctionsale.common.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the category database table.
 * 
 */
@Entity
@Table(name="category")
@NamedQuery(name="CategoryEntity.findAll", query="SELECT c FROM CategoryEntity c")
public class CategoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="creation_date")
	private Timestamp creationDate;

	private String name;

	private Long rate;

	//bi-directional many-to-one association to CategoryEntity
	@ManyToOne
	@JoinColumn(name="parent_category_id")
	private CategoryEntity parentCategory;

	//bi-directional many-to-one association to CategoryEntity
	@OneToMany(mappedBy="parentCategory")
	private List<CategoryEntity> categories;

	//bi-directional many-to-one association to ProductEntity
	@OneToMany(mappedBy="category",fetch=FetchType.EAGER)
	private List<ProductEntity> products;

	public CategoryEntity() {
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getRate() {
		return this.rate;
	}

	public void setRate(Long rate) {
		this.rate = rate;
	}

	public CategoryEntity getParentCategory() {
		return parentCategory;
	}

	public void setParentCategory(CategoryEntity parentCategory) {
		this.parentCategory = parentCategory;
	}

	public List<CategoryEntity> getCategories() {
		return this.categories;
	}

	public void setCategories(List<CategoryEntity> categories) {
		this.categories = categories;
	}

	public CategoryEntity addCategory(CategoryEntity category) {
		getCategories().add(category);
		category.setParentCategory(this);

		return category;
	}

	public CategoryEntity removeCategory(CategoryEntity category) {
		getCategories().remove(category);
		category.setParentCategory(null);

		return category;
	}

	public List<ProductEntity> getProducts() {
		return this.products;
	}

	public void setProducts(List<ProductEntity> products) {
		this.products = products;
	}

	public ProductEntity addProduct(ProductEntity product) {
		getProducts().add(product);
		product.setCategory(this);

		return product;
	}

	public ProductEntity removeProduct(ProductEntity product) {
		getProducts().remove(product);
		product.setCategory(null);

		return product;
	}

}