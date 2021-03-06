 package com.ecomm.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ecomm.DAO.CategoryDAO;
import com.ecomm.DTO.CategoryDTO;

public class CategoryTest {

static CategoryDAO categoryDAO;
private static AnnotationConfigApplicationContext context;
	
@BeforeClass
	public static void executeFirst()
	{
	 context = new AnnotationConfigApplicationContext();
	 context.scan("com.ecomm");
	context.refresh();
	//context.close();
	categoryDAO=(CategoryDAO)context.getBean("categoryDAO");

	}

//@Ignore
@Test
	public void add() {
	CategoryDTO category =new CategoryDTO();
	category.setCategoryName("Laptop");
	category.setCategoryDescription("i3,i5,i7,i9");
	category.setImageURL("Cat3.png");
	/*category.setActive(true);*/
	assertTrue("Fail to insert",categoryDAO.add(category));
		}

@Ignore
@Test
public void delete() {
	CategoryDTO category = categoryDAO.get(5);
	assertEquals("Successfully deleted the single category from the table!","TV",categoryDAO.delete(category));
	
}

@Ignore
@Test
public void update() {
	CategoryDTO category = categoryDAO.get(2);
	category.setCategoryName("Television");
	category.setCategoryDescription("Smart Television");
	assertEquals("Successfully update the single category in the table!",true,categoryDAO.update(category));
	
}

@Ignore
@Test
public void list() {
	List<CategoryDTO> list=categoryDAO.list();
	assertEquals("Successfully fetched the list of 3 category from the table!",3,categoryDAO.list().size());

}
@Ignore
@Test
public void get() {
	CategoryDTO category = categoryDAO.get(1);
	assertEquals("Successfully fetched a single category from the table!","Television",category.getCategoryName());
}

	}

