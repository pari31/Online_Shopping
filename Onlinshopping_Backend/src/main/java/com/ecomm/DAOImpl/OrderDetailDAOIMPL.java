package com.ecomm.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecomm.DAO.OrderDetailDAO;
import com.ecomm.DTO.OrderDetailDTO;
@Repository("orderDetailDAO")
@Transactional
public class OrderDetailDAOIMPL implements OrderDetailDAO {
@Autowired
SessionFactory sessionFactory;
	@Override
	public List<OrderDetailDTO> list() {
		try {
		return sessionFactory.getCurrentSession().createQuery("From OrderDetailDTO",OrderDetailDTO.class).getResultList();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean add(OrderDetailDTO orderDetailDTO) {
		try {
			sessionFactory.getCurrentSession().persist(orderDetailDTO);
			return true;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(OrderDetailDTO orderDetailDTO) {
		try {
			sessionFactory.getCurrentSession().delete(orderDetailDTO);
			return true;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(OrderDetailDTO orderDetailDTO) {
		try {
			sessionFactory.getCurrentSession().update(orderDetailDTO);
			return true;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public OrderDetailDTO get(int orderDetailId) {
		try {
		return sessionFactory.getCurrentSession().get(OrderDetailDTO.class,orderDetailId);
		}catch(Exception e)
		{
		e.printStackTrace();
		}
		return null;
		}
	}




