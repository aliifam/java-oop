package aliif.arief.application;

import aliif.arief.data.Customer;
import aliif.arief.data.Level;

public class EnumApp {
    public static void main(String[] args) {

        Customer customer = new Customer();

        customer.setName("Aliif");
        customer.setLevel(Level.PREMIUM);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

        String levelname = Level.VIP.name(); //get string from enum
        System.out.println(levelname);

        Level level = Level.valueOf("STANDART"); //get enum from string
        System.out.println(level);

        System.out.println("all level:");

        for (Level value : Level.values()) { //get all enum
            System.out.println(value);
        }
    }
}
