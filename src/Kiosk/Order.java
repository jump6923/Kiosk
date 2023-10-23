package Kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {
    private List<Product> temp;
    private int orderNumber;
    private double totalPrice;
    public Order() {
        temp = new ArrayList<>();
        orderNumber = 1;
    }

    public List<Product> getTemp() {
        return temp;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void addOrder(Product product){
        temp.add(product);
    }
    public double CalcTotalPrice(){
        for(Product product : temp){
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
    public void clearTemp(){ temp.clear();}

}
