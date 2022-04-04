package aliif.arief.application;

import aliif.arief.data.Animal;
import aliif.arief.data.Cat;

public class AnimalApp {
    public static void main(String[] args) {
        
        Animal kucing = new Cat();

        kucing.name = "moli";

        kucing.run();
    }
}
