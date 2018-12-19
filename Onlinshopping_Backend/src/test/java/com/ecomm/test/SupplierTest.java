package com.ecomm.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ecomm.DAO.SupplierDAO;
import com.ecomm.DTO.SupplierDTO;

public class SupplierTest {

	static SupplierDAO supplierDAO;

	private static AnnotationConfigApplicationContext context;

	@BeforeClass
	public static void executeFirst() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.ecomm");
		context.refresh();
		// context.close();
		supplierDAO = (SupplierDAO)context.getBean("supplierDAO");
	}

	//@Ignore
	@Test
	public void add() {
		SupplierDTO supplier = new SupplierDTO();
		supplier.setSupplierId(1001);
		supplier.setSupplierName("Initiative DataSystems Pvt.Ltd.");
		supplier.setSupplierDescription("9D,Singar Nagar,Alambagh,Lucknow,226005");
		assertTrue("Failed to insert the Supplier data!", supplierDAO.add(supplier));
	}

	@Ignore
	@Test
	public void delete() {
		SupplierDTO supplier = supplierDAO.getSupplier(1);
		assertTrue("Failed to delete the particular supplier data!", supplierDAO.delete(supplier));

	}

	@Ignore
	@Test
	public void update() {
		SupplierDTO supplier = supplierDAO.getSupplier(1);
		supplier.setSupplierName("Sahu Electronics");
		supplier.setSupplierDescription(
				"Sahu Agencies(an ISO 9001-2008 Certified Company) is a one stop shop for all electronics, home appliances and other consumer durable items.");
		assertTrue("Failed to update the supplier data!", supplierDAO.update(supplier));
	}

	@Ignore
	@Test
	public void list() {
		List<SupplierDTO> list = supplierDAO.listSupplier();
assertEquals("Failed to fetch the supplier list!",1,list.size());
	}
@Ignore
@Test
public void get() {
	SupplierDTO supplier = supplierDAO.getSupplier(1);
	assertEquals("Successfully fetched the single supplier from the table!","Sahu Electronics",supplier.getSupplierName());
}
}
