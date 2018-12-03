package com.ecomm.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecomm.DAO.SupplierDAO;
import com.ecomm.DTO.SupplierDTO;
@Repository("supplerDAO")
@Transactional
public class SupplierDAOIMPL implements SupplierDAO {

	@Autowired
	SessionFactory sessionFactory;
	@Override
	public boolean add(SupplierDTO supplier) {
		try {
			sessionFactory.getCurrentSession().save(supplier);
			return true;
		}catch (Exception e)
		{e.printStackTrace();
		return false;
	}
	}
	@Override
	public boolean delete(SupplierDTO supplier) {
		try {
			sessionFactory.getCurrentSession().delete(supplier);
			return true;
		}catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
				
	}

	@Override
	public boolean update(SupplierDTO supplier) {
		try {
			sessionFactory.getCurrentSession().update(supplier);
			return true;
		}catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public List<SupplierDTO> listSupplier() {
		try {
			return sessionFactory.getCurrentSession().createQuery("From SupplierDTO ",SupplierDTO.class).list();
		}catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public SupplierDTO getSupplier(int supplierId) {
		try{
			return sessionFactory.getCurrentSession().get(SupplierDTO.class,supplierId);
	}catch (Exception e)
	{
		e.printStackTrace();
		return null;
	}
}
	
}
