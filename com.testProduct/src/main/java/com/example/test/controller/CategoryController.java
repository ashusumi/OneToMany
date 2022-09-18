package com.example.test.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.model.Category;
import com.example.test.model.Product;
import com.example.test.repository.categoryRepository;
import com.example.test.service.categoryService;

@RestController
public class CategoryController {

	@Autowired
	private categoryService catService;
	
	@GetMapping("/api/categories")
	public List<Category> findAll(){
		return catService.findAll();
	}
	
	@GetMapping("/api/categories/{id}")
	public Optional<Category> findByid(@PathVariable("id")Integer id){
		return catService.findById(id);
	}
//	@GetMapping("/api/categories/{id}/product")
//	public List<Product> findProductByCategoryId(@PathVariable("id")Integer id){
//		return catService.listOfProduct(id);
//		
	//}
	
	@DeleteMapping("/delete/{id}")
	public String deleteById(@PathVariable("id")Integer id) {
		catService.deleteById(id);
		return "deleted";
	}
}
