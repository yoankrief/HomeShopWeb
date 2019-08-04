package com.cursan.paris;

public class Bus implements MoyenDeLocomotion {
    public void deplace(String address) {
        System.out.println("Je suis un bus et je vais a l'adresse: " + address);
    }
}
