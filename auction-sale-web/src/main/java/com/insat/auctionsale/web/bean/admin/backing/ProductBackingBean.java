package com.insat.auctionsale.web.bean.admin.backing;

import java.util.ArrayList;
import java.util.List;

import javax.faces.event.ValueChangeEvent;

import org.primefaces.model.UploadedFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.insat.auctionsale.common.dto.ProductDto;
import com.insat.auctionsale.common.enumeration.ProductTypeEnum;
import com.insat.auctionsale.web.bean.admin.model.ProductOnAuctionModelBean;
import com.insat.auctionsale.web.bean.admin.model.UserProductModelBean;

@Component("productBackingBean")
@Scope("view")
public class ProductBackingBean {

	private List<ProductDto> products=new ArrayList<ProductDto>();
	
	@Autowired
	ProductOnAuctionModelBean productOnAuctionModelBean;
	
	@Autowired
	UserProductModelBean userProductModelBean;
	
	

	@Autowired
	public void init()
	{
		products=productOnAuctionModelBean.findProducts();
	}
	
	public void changeShownProducts(ValueChangeEvent event) {
		

		String selectedProductType=event.getNewValue().toString();
		if(selectedProductType.equals(ProductTypeEnum.All_PRODUCT.getType()))
		{
			products=productOnAuctionModelBean.findProducts();
		}
		else if(selectedProductType.equals(ProductTypeEnum.USER_PRODUCT.getType()))
		{
			products=userProductModelBean.getUserProducts();
		}
	}

	


	public List<ProductDto> getProducts() {
		return products;
	}


	public void setProducts(List<ProductDto> products) {
		this.products = products;
	}


}
