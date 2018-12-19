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
			sessionFactory.getCurrentSession().persist(product);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;

	}

	/* Deleting the product */
	@Override
	public boolean delete(ProductDTO product) {
		try {
			product.setActive(false);

			// Calling the update method for soft delete

			return this.update(product);
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

		}
		return false;
	}

	/* Fetching list of products */
	@Override
	public List<ProductDTO> listProducts() {
		try {
			return sessionFactory.getCurrentSession().createQuery("From ProductDTO", ProductDTO.class).getResultList();

		} catch (Exception e) {
			e.printStackTrace();

		}
		return null;
	}

	/* Fetching single product */
	@Override
	public ProductDTO getProduct(int productId) {
		try {
			return sessionFactory.getCurrentSession().get(ProductDTO.class, productId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<ProductDTO> listActiveProducts() {
		String selectActiveProducts = "FROM ProductDTO WHERE active =true";
		return sessionFactory.getCurrentSession().createQuery(selectActiveProducts, ProductDTO.class).getResultList();
	}

	@Override
	public List<ProductDTO> listActiveProductsByCategory(int CategoryId) {
		String selectActiveProductsByCategory = "FROM ProductDTO WHERE active = :active AND CategoryId = :categoryId";
		return sessionFactory.getCurrentSession().createQuery(selectActiveProductsByCategory, ProductDTO.class)
				.setParameter("active", true).setParameter("categoryId", CategoryId).getResultList();
	}

	@Override
	public List<ProductDTO> getLatestActiveProducts(int count) {
		return sessionFactory.getCurrentSession().createQuery("FROM ProductDTO WHERE active = :active ORDER BY id", ProductDTO.class)
				.setParameter("active", true).setFirstResult(0).setMaxResults(count).getResultList();
	}

}
