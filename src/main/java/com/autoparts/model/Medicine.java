package com.autoparts.model;

public class Medicine {
    //   "partNumber": "7a-234",
//		  "name": "7a-234: Clutch plate",
//		  "description": "Four wheeler clutch plate for 1.0 litre engine",
//		  "inStock": true

    private String medicineNumber;
    private String name;
    private String manufacturer;
    private Boolean inStock;
    public void setMedicineNumber(String medicineNumber) {
        this.medicineNumber =medicineNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setInStock(Boolean inStock) {
        this.inStock = inStock;
    }

    public String getMedicineNumber() {
        return this.medicineNumber;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Boolean getInStock() {
        return inStock;
    }

}