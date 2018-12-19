package com.ecomm.DAO;

import java.util.List;

import com.ecomm.DTO.CartDTO;


public interface CartDAO {
	public List<CartDTO> list();

	public boolean add(CartDTO cartDTO);

	public boolean delete(CartDTO cartDTO);

	public boolean update(CartDTO cartDTO);

	public CartDTO get(int cartId);

}
