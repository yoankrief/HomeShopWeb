package com.cursan;

import com.cursan.homeshop.*;
import com.cursan.paris.Bus;
import com.cursan.paris.MoyenDeLocomotion;
import com.cursan.paris.Parisien;
import com.cursan.paris.Taxi;

public class Main {

    public static void main(String[] args) {
        Product cafe = new Product("Philips HD7866/61", "Philips SENSEO Quadrante, Noir - 1 ou 2 tasses", 79.99);
        Television tv = new Television("TV Samsung UE49MU6292", "Smart TV LED incurvée 49\"", 599, 49, "LED");
        Fridge fridge = new Fridge("BEKO TSE 1042 F", "Réfrigérateur BEKO 130L - Classe A+ - blanc", 189, 130, false);

        Customer customer = new Customer("Juste Leblanc", "19 rue Germain Pilon, Paris");

        Bill bill = new Bill(customer, new RelayDelivery(27));
        bill.addProduct(cafe, 1);
        bill.addProduct(tv, 1);
        bill.addProduct(fridge, 1);

        bill.generate(new FileWriter("facture Leblanc"));

        Parisien jean = new Parisien();
        Bus bus_103 = new Bus();
        Taxi taxi_abdel_kader = new Taxi();

        jean.seDeplacer(bus_103);
        jean.seDeplacer(taxi_abdel_kader);

        MoyenDeLocomotion taxi_momo = new Taxi();

        jean.seDeplacer(taxi_momo);
    }

}
