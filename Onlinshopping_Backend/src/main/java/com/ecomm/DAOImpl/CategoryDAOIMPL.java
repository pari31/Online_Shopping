package com.ecomm.DAOImpl;


import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecomm.DAO.CategoryDAO;
import com.ecomm.DTO.CategoryDTO;


@Repository("categoryDAO")
@Transactional
public class CategoryDAOIMPL implements CategoryDAO {
@Autowired
private SessionFactory sessionFactory;
	

	@Override
	public List<CategoryDTO> list() {
		
			String selectActiveCategory = "FROM CategoryDTO where active = :active";
			Query query = sessionFactory.getCurrentSession().createQuery(selectActiveCategory);
			query.setParameter("active", true);
			return query.getResultList();
		} 
		
	

	@Override
	public boolean add(CategoryDTO category) {
		try {
			sessionFactory.getCurrentSession().save(category);
			return true;
		}catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
		
	

	@Override
	public boolean delete(CategoryDTO category) {
		category.setActive(false);
		try {
			sessionFactory.getCurrentSession().delete(category);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public boolean update(CategoryDTO category) {
		
		try{sessionFactory.getCurrentSession().update(category);
		return true;
	} catch (Exception e) {
		e.printStackTrace();
		return false;
	}
		
	}

	@Override
	public CategoryDTO get(int CategoryId) {
		//Enhanced for loop
		try {
			return sessionFactory.getCurrentSession().get(CategoryDTO.class,CategoryId);
			}catch (Exception e)
		{e.printStackTrace();
		return null;
		}
	}
	
}

	
	

	
	 
	  
	  
	  
	 

