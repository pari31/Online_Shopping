package com.ecomm.DAOImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.ecomm.DAO.CategoryDAO;
import com.ecomm.DTO.CategoryDTO;

@Repository("categoryDAO")
@Transactional
public class CategoryDAOIMPL implements CategoryDAO {

	private static List<CategoryDTO> categories = new ArrayList<>();

	static {

		CategoryDTO category = new CategoryDTO();

		// adding first category
		category.setCategoryName("Television");
		category.setCategoryDescription("Smart LED/OLED");
		category.setImageURL("Cat_1.png");

		categories.add(category);

		// adding second category
		category.setCategoryName("Mobile");
		category.setCategoryDescription("Smart LED/OLED");
		category.setImageURL("Cat_2.png");

		categories.add(category);

		// adding third category
		category.setCategoryName("Laptop");
		category.setCategoryDescription("i3/i5/i7/i9");
		category.setImageURL("Cat_3.png");

		categories.add(category);

	}

	@Override
	public List<CategoryDTO> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public boolean add(CategoryDTO category) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(CategoryDTO category) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(CategoryDTO category) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public CategoryDTO get(int CategoryId) {
		//Enhanced for loop
		 for(CategoryDTO category : categories) {
			 if(category.getCategoryId() == CategoryId) return category;
		 }
		return null;
	}

	
	

	/*
	 * @Autowired SessionFactory sessionFactory;
	 * 
	 * //Fetching list of categories
	 * 
	 * @Override public List<CategoryDTO> list() { try { return
	 * sessionFactory.getCurrentSession().createQuery("From CategoryDTO",CategoryDTO
	 * .class).getResultList(); }catch (Exception e) { e.printStackTrace(); return
	 * null; }
	 * 
	 * } //Inserting a category
	 * 
	 * @Override public boolean add(CategoryDTO category) { try {
	 * sessionFactory.getCurrentSession().save(category); return true; } catch
	 * (Exception e) { e.printStackTrace(); return false; }
	 * 
	 * } //Deleting the category
	 * 
	 * @Override public boolean delete(CategoryDTO category) { try {
	 * sessionFactory.getCurrentSession().delete(category); return true; } catch
	 * (Exception e) { e.printStackTrace(); return false; }
	 * 
	 * } //Update the product in the table
	 * 
	 * @Override public boolean update(CategoryDTO category) { try {
	 * sessionFactory.getCurrentSession().update(category); return true; } catch
	 * (Exception e) { e.printStackTrace(); return false; }
	 * 
	 * } //Fetching single product
	 * 
	 * @Override public CategoryDTO getCategory(int CategoryId) { try { return
	 * sessionFactory.getCurrentSession().get(CategoryDTO.class,CategoryId); }catch
	 * (Exception e) {e.printStackTrace(); return null;
	 * 
	 * }
	 * 
	 * 
	 * }
	 */
}
