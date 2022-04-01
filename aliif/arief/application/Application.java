package aliif.arief.application;

import aliif.arief.data.*;

public class Application {
    public static void main(String[] args) {
        
        Product product = new Product("MacBook Pro", 30_000_000);

        System.out.println(product.name);
        System.out.println(product.price);

        Data data = new Data();
    }
}
