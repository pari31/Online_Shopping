package com.ecomm.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ecomm.DAO.UserDAO;
import com.ecomm.DTO.UserDTO;

public class UserTest {

	static UserDAO userDAO;
	
	private static AnnotationConfigApplicationContext context;
	
	@BeforeClass
	public static void executeFirst()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.ecomm");
		context.refresh();
		//context.close();
		userDAO=(UserDAO)context.getBean("userDAO");
	
}
	
//@Ignore
@Test
public void add()
{
	UserDTO user = new UserDTO();
	user.setFirstName("Paritosh");
	user.setLastName("Kumar");
	user.setEmail("pari_kumar@rediffmail.com");
	user.setContactNumber("7054949423");
assertTrue("Failed to insert the User detail!",userDAO.add(user));	
}
@Ignore
@Test
public void delete()
{
	UserDTO user = userDAO.getUser(1);
	assertEquals("Successfully deleted the single user form the table!",true,userDAO.delete(user));
}
@Ignore
@Test
public void update()
{
	UserDTO user = userDAO.getUser(1);
	user.setFirstName("Vikram");
	user.setLastName("Kapoor");
	user.setEmail("vikram.kapoor@rediffmail.com");
	user.setContactNumber("8865321445");
	
	assertEquals("Successfully updated the single user!",true,userDAO.update(user));
}
@Ignore
@Test
public void list()
{
	List<UserDTO>list = userDAO.listUsers();
	assertEquals("Failed to get list!",1,list.size());
	}
@Ignore
@Test
public void get()
{
	UserDTO user = userDAO.getUser(2);
	assertEquals("Successfully fetched a single user from the table!","Vikram",user.getFirstName());
	
}

}
