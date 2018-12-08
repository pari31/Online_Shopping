package com.ecomm.DAO;

import java.util.List;

import com.ecomm.DTO.UserDTO;

public interface UserDAO {
	public boolean add(UserDTO user);

	public boolean delete(UserDTO user);

	public boolean update(UserDTO user);

	public List<UserDTO> listUsers();

	public UserDTO getUser(int UserId);
}
