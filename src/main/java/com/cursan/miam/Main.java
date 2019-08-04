package com.cursan.miam;

public class Main {

    public static void main(String[] args) {
        Four grandFour = new Four();
        grandFour.setCapacite(55);
        grandFour.setPuissance(260);

        Aliment cake = new Aliment();
        cake.nom = "cake aux fruits";
        cake.estCuit = false;
        cake.manger();
        System.out.println("");
        grandFour.cuire(cake);
        System.out.println("");
        cake.manger();
    }
}