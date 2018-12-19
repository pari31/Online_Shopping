package com.ecomm.DTO;

public class CartDTO {
private int cartId;
private double grandTotal;
private int cartLine;
private UserDTO user;
public void setUser(UserDTO user) {
	this.user = user;
}
public int getCartId() {
	return cartId;
}
public void setCartId(int cartId) {
	this.cartId = cartId;
}
public double getGrandTotal() {
	return grandTotal;
}
public void setGrandTotal(double grandTotal) {
	this.grandTotal = grandTotal;
}
public int getCartLine() {
	return cartLine;
}
public void setCartLine(int cartLine) {
	this.cartLine = cartLine;
}
public UserDTO getUser() {
	return user;
}

}
