package com.example.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.test.model.Category;
import com.example.test.model.Product;


public interface categoryRepository extends CrudRepository<Category, Integer>{

//	@Query("select product from category c where c.id=?1")
//	List<Product> getProductByCategoryId(Integer id);
	

}
 