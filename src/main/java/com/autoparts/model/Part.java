package com.autoparts.model;

public class Part {

	private String partNumber;
	private String name;
	private String description;
	private Boolean inStock;
	
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setInStock(Boolean inStock) {
		this.inStock = inStock;
	}
	
	public String getPartNumber() {
		return this.partNumber;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public Boolean getInStock() {
		return inStock;
	}
}
