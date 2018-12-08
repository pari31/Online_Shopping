package com.ecomm.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecomm.DAO.UserDAO;
import com.ecomm.DTO.UserDTO;

@Repository("userDAO")
@Transactional
public class UserDAOIMPL implements UserDAO {

	@Autowired // To fetch the beans
	SessionFactory sessionFactory;

	@Override
	public boolean add(UserDTO user) {
		try {
			sessionFactory.getCurrentSession().save(user);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean delete(UserDTO user) {
		try {
			sessionFactory.getCurrentSession().delete(user);
			return true;
		}catch (Exception e)
		{
			e.printStackTrace();
		return false;
	}
	}

	@Override
	public boolean update(UserDTO user) {
		try {
			sessionFactory.getCurrentSession().update(user);
			return true;
		}catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
	
	}

	@Override
	public List<UserDTO> listUsers() {
		try {
		return sessionFactory.getCurrentSession().createQuery("From UserDTO", UserDTO.class).list();
	}catch (Exception e)
	{
		e.printStackTrace();
		return null;
	}
	}


	@Override
	public UserDTO getUser(int UserId) {
		try{
			return sessionFactory.getCurrentSession().get(UserDTO.class,UserId);
	}catch (Exception e)
		{
		e.printStackTrace();
		return null;
		}
		
		
	}

}
