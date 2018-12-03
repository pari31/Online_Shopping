package com.ecomm.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ecomm.DAO.ProductDAO;
import com.ecomm.DTO.ProductDTO;

public class ProductDAOTest {

	static ProductDAO productDAO;

	private static AnnotationConfigApplicationContext context;

	@BeforeClass
	public static void executeFirst() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.ecomm");
		context.refresh();
		// context.close();

		productDAO = (ProductDAO) context.getBean("productDAO");
	}

	/* Creating Product */
	@Ignore
	@Test
	public void addProductTest() {
		ProductDTO product = new ProductDTO();
		product.setProductName("Honor 9N");
		product.setPoductBarand("Honor");
		product.setProductDescription("Honor 9N 4G.B.RAM and 128 G.B. Rom");
		product.setUnitPrice(15000);
		product.setProductQuatity(5);
		assertTrue("Failed to add product !", productDAO.add(product));
	}

	/* Deleting or Inactive the Category Product */
	@Ignore
	@Test
	public void deleteProductTest() {
		ProductDTO product = productDAO.getProduct(2);
		assertEquals("Successfully deleted  the single category in the table!", true, productDAO.delete(product));

	}

	@Ignore
	@Test
	public void updateProductTest() {
		ProductDTO product = productDAO.getProduct(3);
		product.setProductName("Samsung 8");
		product.setPoductBarand("Samsung");
		product.setProductDescription("Samsung 8 4G.B.RAM and 128 G.B. Rom");
		product.setUnitPrice(55000);
		product.setProductQuatity(2);
		assertTrue("Failed updated  the product!", productDAO.update(product));
	}

	/* Fetching list of products */
	@Ignore
	@Test
	public void testList() {
		List<ProductDTO> list = productDAO.listProducts();
		assertEquals("Failed to get list!", 2, list.size());
	}

	/* Fetching the Active Product List from the table */
	// @Ignore
	@Test
	public void testListActiveProducts() {
		assertEquals("Successfully fetched the Active Product List from the table!", 1,
				productDAO.listProducts().size());
	}
}