package com.ecomm.DAO;

import java.util.List;

import com.ecomm.DTO.ProductDTO;

public interface ProductDAO {
	public boolean add(ProductDTO product);

	public boolean delete(ProductDTO product);

	public boolean update(ProductDTO product);

	public List<ProductDTO> listProducts();

	public ProductDTO getProduct(int productId);

}
