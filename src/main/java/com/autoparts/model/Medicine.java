package com.autoparts.model;

public class Medicine {

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