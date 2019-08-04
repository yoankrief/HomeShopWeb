package com.cursan.paris;

public class Taxi implements MoyenDeLocomotion {
    public void deplace(String address) {
        System.out.println("Je suis un taxi et je vais a l'adresse: " + address);

    }
}
