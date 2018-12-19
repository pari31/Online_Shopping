package com.ecomm.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecomm.DAO.CartDAO;
import com.ecomm.DTO.CartDTO;

@Repository("cartDAO")
@Transactional
public class CartDAOIMPL implements CartDAO {
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public List<CartDTO> list() {
		try {
			return sessionFactory.getCurrentSession().createQuery("From CartDTO", CartDTO.class).getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean add(CartDTO cartDTO) {
		try {
			sessionFactory.getCurrentSession().persist(cartDTO);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(CartDTO cartDTO) {
		try {
			sessionFactory.getCurrentSession().delete(cartDTO);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(CartDTO cartDTO) {
		try {
			sessionFactory.getCurrentSession().update(cartDTO);
			return true;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public CartDTO get(int cartId) {
		try {
		return sessionFactory.getCurrentSession().get(CartDTO.class,cartId);
				}catch(Exception e)
				{
					e.printStackTrace();
				}
return null;
}
}