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
	//@NotBlank(message="Please enter the product name!")
	private String ProductName;
	//@NotBlank(message="Please enter the product brand!")	
	private String PoductBarand;
	//@NotBlank(message="Please enter the product description!")
	private String ProductDescription;
	//@Column (name="unit_price")
	//@Min(value=1, message="The unit price cannot be less than 1!")
	private double UnitPrice;
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
	public String getPoductBarand() {
		return PoductBarand;
	}
	public void setPoductBarand(String poductBarand) {
		PoductBarand = poductBarand;
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
	public int getProductQuatity() {
		return ProductQuatity;
	}
	public void setProductQuatity(int productQuatity) {
		ProductQuatity = productQuatity;
	}
	private int ProductQuatity;
	
	

}
