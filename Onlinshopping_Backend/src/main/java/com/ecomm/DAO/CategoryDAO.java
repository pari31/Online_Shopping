package com.ecomm.DAO;

import java.util.List;

import com.ecomm.DTO.CategoryDTO;

public interface CategoryDAO {

	public boolean add(CategoryDTO category);

	public boolean delete(CategoryDTO category);

	public boolean update(CategoryDTO category);

	public List<CategoryDTO> listCategories();

	public CategoryDTO getCategory(int CategoryId);

	
}
