package com.ecomm.DTO;

public class AddressDTO {
private int addressId;
private String address_Line_One;
private  String address_Line_Two;
private String city;
private String state;
private String country;
private String pinCode;
private boolean addressShipping;
private boolean addressBilling;
private int UserId;

public int getAddressId() {
	return addressId;
}
public void setAddressId(int addressId) {
	this.addressId = addressId;
}
public String getAddress_Line_One() {
	return address_Line_One;
}
public void setAddress_Line_One(String address_Line_One) {
	this.address_Line_One = address_Line_One;
}
public String getAddress_Line_Two() {
	return address_Line_Two;
}
public void setAddress_Line_Two(String address_Line_Two) {
	this.address_Line_Two = address_Line_Two;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getPinCode() {
	return pinCode;
}
public void setPinCode(String pinCode) {
	this.pinCode = pinCode;
}
public boolean isAddressShipping() {
	return addressShipping;
}
public void setAddressShipping(boolean addressShipping) {
	this.addressShipping = addressShipping;
}
public boolean isAddressBilling() {
	return addressBilling;
}
public void setAddressBilling(boolean addressBilling) {
	this.addressBilling = addressBilling;
}
public int getUserId() {
	return UserId;
}
public void setUserId(int userId) {
	UserId = userId;
}
}
