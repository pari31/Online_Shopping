package com.ecomm.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecomm.DAO.ProductDAO;
import com.ecomm.DTO.ProductDTO;

@Repository("productDAO")
@Transactional
public class ProductDAOIMPL implements ProductDAO {

	@Autowired
	SessionFactory sessionFactory;

	/* Inserting a product */
	@Override
	public boolean add(ProductDTO product) {
		try {
			sessionFactory.getCurrentSession().save(product);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/* Deleting the product */
	@Override
	public boolean delete(ProductDTO product) {
		try {
			sessionFactory.getCurrentSession().delete(product);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	/* Update the product in the table */
	@Override
	public boolean update(ProductDTO product) {
		try {
			sessionFactory.getCurrentSession().update(product);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	/* Fetching list of products */
	@Override
	public List<ProductDTO> listProducts() {
		try {
			return sessionFactory.getCurrentSession().createQuery("From ProductDTO",ProductDTO.class).getResultList();
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		}
	
	/* Fetching single product */
	@Override
	public ProductDTO getProduct(int productId) {
		try {
			return sessionFactory.getCurrentSession().get(ProductDTO.class,productId);
			}catch (Exception e)
		{e.printStackTrace();
		return null;
		}
	}

}
