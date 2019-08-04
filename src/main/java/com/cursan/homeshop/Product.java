package com.cursan.homeshop;

public class Product {

    private String name;
    private String description;
    private double price;

    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    /**
     * Display a full description of the product
     */
    public  void look(){

    }

    /**
     * Add the product to the bill
     * @param bill the concerned bill
     * @param quantity quantity to add
     */
    public void buy(Bill bill, Integer quantity){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
