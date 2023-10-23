package Kiosk;

import java.util.Scanner;

public class Product extends Menu {
    private double price;
    public Product() {
    }
    public Product(String name, double price, String description){
        this.name = name;
        this.price = price;
        this.description = description;
    }
    @Override
    public void setName(String name) {
        super.setName(name);
    }
    @Override
    public void setDescription(String description) {
        super.setDescription(description);
    }
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String getDescription() {
        return super.getDescription();
    }
    @Override
    public String getName() {
        return super.getName();
    }
    public double getPrice() {
        return price;
    }
}

