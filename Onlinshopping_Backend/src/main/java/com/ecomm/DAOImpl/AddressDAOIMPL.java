package com.ecomm.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecomm.DAO.AddressDAO;
import com.ecomm.DTO.AddressDTO;

@Repository("addressDAO")
@Transactional
public class AddressDAOIMPL implements AddressDAO {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public List<AddressDTO> list() {
		try {
			return sessionFactory.getCurrentSession().createQuery("From AddressDTO", AddressDTO.class).getResultList();

		} catch (Exception e) {
			e.printStackTrace();

		}
		return null;

	}

	@Override
	public boolean add(AddressDTO addressDTO) {
		try {
			sessionFactory.getCurrentSession().persist(addressDTO);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(AddressDTO addressDTO) {
		try {
			sessionFactory.getCurrentSession().delete(addressDTO);
			return true;
					}catch(Exception e)
		{
						e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(AddressDTO addressDTO) {
		try {
			sessionFactory.getCurrentSession().update(addressDTO);
			return true;
		} catch (Exception e) {
			e.printStackTrace();

		}
		return false;
	}

	@Override
	public AddressDTO get(int addressId) {
		try {
			return sessionFactory.getCurrentSession().get(AddressDTO.class, addressId);
		}catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		
	}

}
