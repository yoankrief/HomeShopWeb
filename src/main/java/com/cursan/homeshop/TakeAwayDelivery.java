package com.cursan.homeshop;

public class TakeAwayDelivery implements Delivery {
    public double getPrice() {
        return 0;
    }

    public String getInfo() {
        return "TakeAway";
    }
}
