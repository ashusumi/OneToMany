package com.example.test.service;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.ServerEndpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.model.Category;
import com.example.test.model.Product;
import com.example.test.repository.categoryRepository;

@Service
public class categoryService {
	
@Autowired
private categoryRepository catrepository;
public List<Category> findAll(){
	return (List<Category>) catrepository.findAll();
	
}

public Optional<Category> findById(Integer id){
	return catrepository.findById(id);
}
//public List<Product> listOfProduct(Integer id){
//	return catrepository.getProductByCategoryId(id);
//}

public String deleteById(Integer id) {
	 catrepository.deleteById(id);
	 return "category deleted";
}

}
