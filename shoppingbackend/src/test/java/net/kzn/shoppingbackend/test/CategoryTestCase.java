package net.kzn.shoppingbackend.test;

import static org.junit.Assert.assertEquals;
import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CategoryTestCase {
	private static AnnotationConfigApplicationContext context;

	private static CategoryDAO categoryDAO;

	private static Category category;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("net.kzn.shoppingbackend");
		context.refresh();

		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	}

	//Set the category in the table
	/*@Test
	public void testAddCategory() 
	{
		category=new Category();
		
		category.setName("Fan");
		category.setDescription("This is the Summer Fan");
		category.setImageURL("fan.png");

		assertEquals("successfully add ", true, categoryDAO.add(category));

	}*/
	
	//updating a single category in list
	/*public void testUpdateCategory()
	{
		category=categoryDAO.get(3);
		category.setName("TV");
		assertEquals("successfully delete from the table ",true,categoryDAO.update(category));
	}*/
	
	//fetch the single category 
	/*@Test
	public void testGetCategory()
	{
		category=categoryDAO.get(3);
		assertEquals("successfully fetched from the table","Laptop",category.getName());
	}*/
	
	//updating a single category
	/*@Test
	public void testDeleteCategory()
	{
		category=categoryDAO.get(3);
		assertEquals("successfully delete from the table ",true,categoryDAO.delete(category));
	}*/
	
	/*@Test
	public void testFetchCategory()
	{		
		assertEquals("successfully fetched the list of Categories from the table ",3,categoryDAO.list().size());
	}
	*/
	
	/*@Test
	public void testCRUDCategory()
	{
		//add operation
		category=new Category();
		
		category.setName("Fan");
		category.setDescription("This is the Summer Fan");
		category.setImageURL("fan.png");
		assertEquals("successfully add ", true, categoryDAO.add(category));
		
		category.setName("Television");
		category.setDescription("This all about plasma tv");
		category.setImageURL("laptop.png");
		assertEquals("successfully add ", true, categoryDAO.add(category));
		
		
		//fetching and updating the category
			category=categoryDAO.get(2);
			category.setName("TV");
			assertEquals("successfully updating the table ",true,categoryDAO.update(category));
		
		//deleting the category
		assertEquals("successfully delete from the table ",true,categoryDAO.delete(category));
		
		//fetching the list
		assertEquals("successfully fetched the list of Categories from the table ",1,categoryDAO.list().size());
	}*/
	
	//INSERT INTO CATEGORY(name,description,image_url,is_active) VALUES('Mobile','This is 4g smartphone!!!!','mobile.png',true);
}
