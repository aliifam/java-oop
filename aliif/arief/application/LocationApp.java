package aliif.arief.application;

import aliif.arief.data.City;

public class LocationApp {
    public static void main(String[] args) {
        
        var kota = new City();
        kota.name = "Yogyakarta";

        System.out.println(kota.name);
    }
}
