package com.insat.auctionsale.web.bean.admin.backing;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.event.ActionEvent;

import org.primefaces.context.RequestContext;
import org.primefaces.event.NodeExpandEvent;
import org.primefaces.event.NodeSelectEvent;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.insat.auctionsale.common.dto.CategoryDto;
import com.insat.auctionsale.core.service.ProductManagementService;
import com.insat.auctionsale.web.bean.admin.model.ProductCategoryModelBean;

@Component("productCategoryBackingBean")
@Scope("view")
public class ProductCategoryBackingBean {

	@Autowired
	ProductCategoryModelBean productCategoryModelBean;

	@Autowired
	ProductManagementService productManagementService;

	List<Integer> insertedCategoriesId = new ArrayList<Integer>();

	private TreeNode root;
	private TreeNode selectedNode;

	@PostConstruct
	public void init() {
		createCatgoriesTable();
	}

	public void onNodeExpand(NodeExpandEvent event) {

	}

	public void onNodeSelect(NodeSelectEvent event) {
		CategoryDto categoryDto = (CategoryDto) event.getTreeNode().getData();
		event.getTreeNode().getChildren();
		List<CategoryDto> categoriesDto = productManagementService
				.findSubCategoriesByCategoryId(categoryDto.getId());

		for (CategoryDto subCategoryDto : categoriesDto) {
			if (!insertedCategoriesId.contains(subCategoryDto.getId())) {
				insertedCategoriesId.add(subCategoryDto.getId());
				TreeNode category = new DefaultTreeNode(subCategoryDto,
						event.getTreeNode());
			}
		}
		event.getTreeNode().setExpanded(true);
	}

	public void createCatgoriesTable() {
		List<CategoryDto> categoriesDto = productManagementService
				.findRootCategories();
		root = new DefaultTreeNode(new CategoryDto(), null);

		for (CategoryDto categoryDto : categoriesDto) {
			TreeNode category = new DefaultTreeNode(categoryDto, root);
		}

	}

	public void addCategory() {
		RequestContext.getCurrentInstance().openDialog("category-dialog");
	}
	
	public TreeNode getRoot() {
		return root;
	}

	public void setRoot(TreeNode root) {
		this.root = root;
	}

	public TreeNode getSelectedNode() {
		return selectedNode;
	}

	public void setSelectedNode(TreeNode selectedNode) {
		this.selectedNode = selectedNode;
	}

}
