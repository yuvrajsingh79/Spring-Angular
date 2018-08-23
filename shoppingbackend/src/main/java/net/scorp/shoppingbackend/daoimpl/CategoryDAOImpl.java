package net.scorp.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.scorp.shoppingbackend.dao.CategoryDAO;
import net.scorp.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();

	static {
		Category category = new Category();

		// adding 1st category
		category.setId(1);
		category.setName("Accessories");
		category.setDescription("It contains all elctronic accessories.");
		category.setImageUrl("CAT_1.png");
		category.setActive(true);
		categories.add(category);

		// adding 2nd category
		category = new Category();
		category.setId(2);
		category.setName("Computers");
		category.setDescription("It contains all computers.");
		category.setImageUrl("CAT_2.png");
		category.setActive(true);
		categories.add(category);

		// adding 2nd category
		category = new Category();
		category.setId(3);
		category.setName("Mobiles");
		category.setDescription("It contains all mobiles.");
		category.setImageUrl("CAT_3.png");
		category.setActive(true);
		categories.add(category);
	}

	@Override
	public java.util.List<Category> List() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		for(Category category : categories ) {
			if(category.getId() == id) return category;
		}
		return null;
	}

}
