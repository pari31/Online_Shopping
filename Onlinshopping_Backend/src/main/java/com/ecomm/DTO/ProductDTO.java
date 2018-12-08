package com.ecomm.DTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class ProductDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ProductId;
	public int getProductId() {
		return ProductId;
	}
	public void setProductId(int productId) {
		ProductId = productId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getPoductBrand() {
		return ProductBrand;
	}
	public void setPoductBrand(String poductBrand) {
		ProductBrand = poductBrand;
	}
	public String getProductDescription() {
		return ProductDescription;
	}
	public void setProductDescription(String productDescription) {
		ProductDescription = productDescription;
	}
	public double getUnitPrice() {
		return UnitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		UnitPrice = unitPrice;
	}
	public int getProductQuantity() {
		return ProductQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		ProductQuantity = productQuantity;
	}
	private String ProductName;
	private String ProductBrand;
	private String ProductDescription;
	private double UnitPrice;
	private int ProductQuantity;
	
}
