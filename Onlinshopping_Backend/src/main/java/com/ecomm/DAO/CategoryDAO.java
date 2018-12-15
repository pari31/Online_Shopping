package com.ecomm.DAO;

import java.util.List;

import com.ecomm.DTO.CategoryDTO;

public interface CategoryDAO {

	public List<CategoryDTO> list();

	public boolean add(CategoryDTO category);

	public boolean delete(CategoryDTO category);

	public boolean update(CategoryDTO category);

	public CategoryDTO get(int CategoryId);

}
