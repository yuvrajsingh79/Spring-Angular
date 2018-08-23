package net.scorp.shoppingbackend.dao;

import java.util.List;

import net.scorp.shoppingbackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> List();

	Category get(int id);

}
