package aliif.arief.data;

public class ProductApp {
    public static void main(String[] args) {
        
        Product product = new Product("MacBook Pro", 30000000);
        System.out.println(product.name);
        System.out.println(product.price);

    }
}
