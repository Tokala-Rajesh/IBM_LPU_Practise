package com.example.demo.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class,property = "@id",scope = Item.class)
@Data
@ToString
@NoArgsConstructor
@Entity
public class Item 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="item_name")
	private String itemName;
	@Column(name="category")
    private String category;
	@Column(name="description")
    private String description;
	
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Item(String itemName, String category, String description) {
		super();
		this.itemName = itemName;
		this.category = category;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", category=" + category + ", description=" + description + "]";
	}
    

}
