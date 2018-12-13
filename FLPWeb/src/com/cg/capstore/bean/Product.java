package com.cg.capstore.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;
	private String productName;
	private String productDiscription;
	private double productRating;
	private String productFeedback;
	private String productCategory;
	//private Image productImage;
	private double productCost;
	private String merchantType;
	
	//setters and getters
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDiscription() {
		return productDiscription;
	}
	public void setProductDiscription(String productDiscription) {
		this.productDiscription = productDiscription;
	}
	public double getProductRating() {
		return productRating;
	}
	public void setProductRating(double productRating) {
		this.productRating = productRating;
	}
	public String getProductFeedback() {
		return productFeedback;
	}
	public void setProductFeedback(String productFeedback) {
		this.productFeedback = productFeedback;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	/*public Image getProductImage() {
		return productImage;
	}
	public void setProductImage(Image productImage) {
		this.productImage = productImage;
	}*/
	public double getProductCost() {
		return productCost;
	}
	public void setProductCost(double productCost) {
		this.productCost = productCost;
	}
	public String getMerchantType() {
		return merchantType;
	}
	public void setMerchantType(String merchantType) {
		this.merchantType = merchantType;
	}
	
	
}
