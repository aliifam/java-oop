package aliif.arief.application;

import aliif.arief.data.Category;

public class CategoryApp {
    public static void main(String[] args) {
        
        var category = new Category();

        category.setId("1234");
        category.setExpensive(true);

        System.out.println(category.getId());
        System.out.println(category.isExpensive());
    }
}
