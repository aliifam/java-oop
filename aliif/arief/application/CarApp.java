package aliif.arief.application;

import aliif.arief.data.Car;
import aliif.arief.data.Fortuner;

public class CarApp {
    public static void main(String[] args) {
        
        Car mobil = new Fortuner();

        mobil.drive();

        System.out.println(mobil.getTire());
        
    }
}
