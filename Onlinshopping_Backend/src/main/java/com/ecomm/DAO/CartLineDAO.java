package com.ecomm.DAO;

import java.util.List;


import com.ecomm.DTO.CartLineDTO;

public interface CartLineDAO {
	public List<CartLineDTO> list();

	public boolean add(CartLineDTO cartLineDTO);

	public boolean delete(CartLineDTO cartLineDTO);

	public boolean update(CartLineDTO cartLineDTO);

	public CartLineDTO get(int cartLineId);

}
