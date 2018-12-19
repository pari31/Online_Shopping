package com.ecomm.DTO;

public class OrderItemDTO {
private int orderItemId;
private ProductDTO productDTO;
private OrderDetailDTO orderDetailDTO;
private double buyingPrice;
private int productCount;
private double total;

public int getOrderItemId() {
	return orderItemId;
}
public void setOrderItemId(int orderItemId) {
	this.orderItemId = orderItemId;
}
public ProductDTO getProductDTO() {
	return productDTO;
}
public void setProductDTO(ProductDTO productDTO) {
	this.productDTO = productDTO;
}
public OrderDetailDTO getOrderDetailDTO() {
	return orderDetailDTO;
}
public void setOrderDetailDTO(OrderDetailDTO orderDetailDTO) {
	this.orderDetailDTO = orderDetailDTO;
}
public double getBuyingPrice() {
	return buyingPrice;
}
public void setBuyingPrice(double buyingPrice) {
	this.buyingPrice = buyingPrice;
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

}
