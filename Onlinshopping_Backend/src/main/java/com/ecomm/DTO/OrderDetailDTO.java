package com.ecomm.DTO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderDetailDTO {

private int  orderDetailId;
private UserDTO userDTO;
private double orderTotal;
private  String addressShipping;
private  String addressBilling;
private List<OrderItemDTO>orderItemDTO=new ArrayList<>();
private int orderCount;
private Date orderDate;

public int getOrderDetailId() {
	return orderDetailId;
}
public void setOrderDetailId(int orderDetailId) {
	this.orderDetailId = orderDetailId;
}

public double getOrderTotal() {
	return orderTotal;
}
public void setOrderTotal(double orderTotal) {
	this.orderTotal = orderTotal;
}
public String getAddressShipping() {
	return addressShipping;
}
public void setAddressShipping(String addressShipping) {
	this.addressShipping = addressShipping;
}
public String getAddressBilling() {
	return addressBilling;
}
public void setAddressBilling(String addressBilling) {
	this.addressBilling = addressBilling;
}
public List<OrderItemDTO> getOrderItemDTO() {
	return orderItemDTO;
}
public void setOrderItemDTO(List<OrderItemDTO> orderItemDTO) {
	this.orderItemDTO = orderItemDTO;
}
public int getOrderCount() {
	return orderCount;
}
public void setOrderCount(int orderCount) {
	this.orderCount = orderCount;
}
public Date getOrderDate() {
	return orderDate;
}
public void setOrderDate(Date orderDate) {
	this.orderDate = orderDate;
}
public UserDTO getUserDTO() {
	return userDTO;
}
public void setUserDTO(UserDTO userDTO) {
	this.userDTO = userDTO;
}
}
