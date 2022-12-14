package com.example.test.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer id;
private String categoryName;
private String description;
@OneToMany(mappedBy = "category")
List<Product> product;
public Category() {
}
public Category(Integer id, String categoryName, String description) {
	super();
	this.id = id;
	this.categoryName = categoryName;
	this.description = description;
}



public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getCategoryName() {
	return categoryName;
}
public void setCategoryName(String categoryName) {
	this.categoryName = categoryName;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}


}
