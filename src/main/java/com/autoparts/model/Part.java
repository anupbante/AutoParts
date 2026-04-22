package com.autoparts.model;

public class Part {

//	[{
//		  "partNumber": "7a-234",
//		  "name": "7a-234: Clutch plate",
//		  "description": "Four wheeler clutch plate for 1.0 litre engine",
//		  "inStock": true
//		},
//
//	
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
