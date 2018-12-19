package com.ecomm.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecomm.DAO.OrderItemDAO;
import com.ecomm.DTO.OrderItemDTO;

@Repository("orderItemDAO")
@Transactional
public class OrderItemDAOIMPL implements OrderItemDAO {
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public List<OrderItemDTO> list() {
		try {
			return sessionFactory.getCurrentSession().createQuery("From OrderItemDTO", OrderItemDTO.class)
					.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean add(OrderItemDTO orderItemDTO) {
		try {
			sessionFactory.getCurrentSession().persist(orderItemDTO);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(OrderItemDTO orderItemDTO) {
		try {
			sessionFactory.getCurrentSession().delete(orderItemDTO);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(OrderItemDTO orderItemDTO) {
		try {
			sessionFactory.getCurrentSession().update(orderItemDTO);

		return true;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public OrderItemDTO get(int orderItemId) {
		try {
			return sessionFactory.getCurrentSession().get(OrderItemDTO.class, orderItemId);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

}
