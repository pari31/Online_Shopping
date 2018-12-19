package com.ecomm.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecomm.DAO.CartLineDAO;
import com.ecomm.DTO.CartLineDTO;

@Repository("cartLineDAO")
@Transactional
public class CartLineDAOIMPL implements CartLineDAO {
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public List<CartLineDTO> list() {
		try{
			return sessionFactory.getCurrentSession().createQuery("From CartLineDTO", CartLineDTO.class).getResultList();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean add(CartLineDTO cartLineDTO) {
		try {
			sessionFactory.getCurrentSession().persist(cartLineDTO);
			return true;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(CartLineDTO cartLineDTO) {
		try {
	sessionFactory.getCurrentSession().delete(cartLineDTO);
	}catch(Exception e)
		{
		e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(CartLineDTO cartLineDTO) {
		try {
		sessionFactory.getCurrentSession().update(cartLineDTO);
		return true;
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	return false;
}

	@Override
	public CartLineDTO get(int cartLineId) {
		try {
			return sessionFactory.getCurrentSession().get(CartLineDTO.class,cartLineId);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

}
