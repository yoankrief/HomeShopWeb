package com.cursan.homeshop;

public class ExpressDelivery implements Delivery {

    private String city;

    public ExpressDelivery(String city) {
        this.city = city;
    }

    public double getPrice() {
        if (this.city.equals("Paris"))
            return 6.99;
        return 9.99;
    }

    public String getInfo() {
        return "Livraison Express";
    }
}
