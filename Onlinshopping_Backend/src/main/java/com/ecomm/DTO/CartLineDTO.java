package com.ecomm.DTO;

public class CartLineDTO {
private int cartLineId;
private ProductDTO product;
private int cartId;
private int productCount;
private double total;
private double buyingPrice;
private boolean available = true;
public int getCartLineId() {
	return cartLineId;
}
public void setCartLineId(int cartLineId) {
	this.cartLineId = cartLineId;
}
public ProductDTO getProduct() {
	return product;
}
public void setProduct(ProductDTO product) {
	this.product = product;
}
public int getCartId() {
	return cartId;
}
public void setCartId(int cartId) {
	this.cartId = cartId;
}
public int getProductCount() {
	return productCount;
}
public void setProductCount(int productCount) {
	this.productCount = productCount;
}
public double getTotal() {
	return total;
}
public void setTotal(double total) {
	this.total = total;
}
public double getBuyingPrice() {
	return buyingPrice;
}
public void setBuyingPrice(double buyingPrice) {
	this.buyingPrice = buyingPrice;
}
public boolean isAvailable() {
	return available;
}
public void setAvailable(boolean available) {
	this.available = available;
}
}
