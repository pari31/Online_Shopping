package com.ecomm.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ecomm.DAO.CategoryDAO;
import com.ecomm.DTO.CategoryDTO;

public class CategoryDAOTest {

static CategoryDAO categoryDAO;
private static AnnotationConfigApplicationContext context;
	
@BeforeClass
	public static void executeFirst()
	{
	 context = new AnnotationConfigApplicationContext();
	 context.scan("com.ecomm");
	context.refresh();
	//context.close();
	}

@Ignore
@Test
	public void addTest() {
	CategoryDTO category =new CategoryDTO();
	category.setCategoryName("Television");
	category.setCategoryDescription("Smart/LED T.V.");
	}

@Ignore
@Test
public void deleteTest() {
	CategoryDTO category = categoryDAO.getCategory(0);
	assertEquals("Successfully deleted the single category from the table!",true,categoryDAO.delete(category));
	
}

@Ignore
@Test
public void updateTest() {
	CategoryDTO category = categoryDAO.getCategory(0);
	category.setCategoryName("Moblie");
	category.setCategoryDescription("Smart Mobile");
	assertEquals("Successfully update the single category in the table!",true,categoryDAO.update(category));
}

//@Ignore
@Test
public void testList() {
	List<CategoryDTO> list=categoryDAO.listCategories();
	assertEquals("Failed to get the list!",1,list.size());

}
}