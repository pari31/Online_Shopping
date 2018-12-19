package com.ecomm.DAO;

import java.util.List;

import com.ecomm.DTO.AddressDTO;


public interface AddressDAO {
	public List<AddressDTO> list();

	public boolean add(AddressDTO addressDTO);

	public boolean delete(AddressDTO addressDTO);

	public boolean update(AddressDTO addressDTO);

	public AddressDTO get(int addressId);
}
