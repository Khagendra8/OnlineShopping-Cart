package net.kzn.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;

@Repository("categoryDAO")
@Transactional
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();
	
	@Autowired
	private SessionFactory sessionFactory;

	static {
		// adding 1st Category
		Category category = new Category();
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is ONIDA TV");
		category.setImageURL("CAT_1.png");

		categories.add(category);

		// adding 2nd Category
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is MI mobiles");
		category.setImageURL("CAT_2.png");

		categories.add(category);

		// adding 3rd Category
		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is DELL Laptop ");
		category.setImageURL("CAT_3.png");

		categories.add(category);

	}

	@Override
	public List<Category> list() {
		String selectActiveCategory="from Category where active = :active";
		Query query=sessionFactory.getCurrentSession().createQuery(selectActiveCategory);
		query.setParameter("active", true);
		return query.getResultList();
	}

	@Override
	/*
	 * getting single category based on id*/
	public Category get(int id) {
		
		return sessionFactory.getCurrentSession().get(Category.class, Integer.valueOf(id));
	}

//add category to the table
	@Override
	public boolean add(Category category) {
		
		try {
			sessionFactory.getCurrentSession().save(category);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	/*
	 * updating a single Category
	 * */
	@Override
	public boolean update(Category category) {
		try {
			sessionFactory.getCurrentSession().update(category);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
/*
 * deleting the category means alternatively we update the category
 * */
	@Override
	public boolean delete(Category category) {
		category.setActive(false);
		try {
			sessionFactory.getCurrentSession().update(category);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
