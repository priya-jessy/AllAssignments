package com.capgemini.angularproject.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonRootName;
@Entity
@Table(name = "products")
@JsonRootName("proInfo")
public class ProductInfo implements Serializable  {
	@Id
	@GeneratedValue
	@Column
	private int productId;
	@Column
	private String productName;
	@Column
	private Double productPrice;
	@Column
	private String productDescription;
	@Column
	private String productImageURL;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public Double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductImageURL() {
		return productImageURL;
	}
	public void setProductImageURL(String productImageURL) {
		this.productImageURL = productImageURL;
	}
	

}
