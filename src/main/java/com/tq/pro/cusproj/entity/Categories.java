package com.tq.pro.cusproj.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categories")
public class Categories {

	@Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="categories_id")
	private long id;
	
	@Column(name = "name", nullable = false, length = 50)
	private String name;
	
	@Column(name = "type_category")
	private int categoryType;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getCategoryType() {
		return categoryType;
	}

	public void setCategoryType(int categoryType) {
		this.categoryType = categoryType;
	}
}
