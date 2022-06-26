package com.eshop.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int category_id;
	String category_name;
	String Alias;
	int enabled;
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	public String getAlias() {
		return Alias;
	}
	public void setAlias(String alias) {
		Alias = alias;
	}
	public int getEnabled() {
		return enabled;
	}
	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}
	public category(int category_id, String category_name, String alias, int enabled) {
		super();
		this.category_id = category_id;
		this.category_name = category_name;
		Alias = alias;
		this.enabled = enabled;
	}
	
	
	public category() {
		
	}
	
	
}
