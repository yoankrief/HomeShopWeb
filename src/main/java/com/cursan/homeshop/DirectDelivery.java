package com.cursan.homeshop;

public class DirectDelivery implements Delivery {
    public double getPrice() {
        return 4.99;
    }

    public String getInfo() {
        return "Livraison Directe";
    }
}


