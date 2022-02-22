class Parent {
    
    String name;

    void doit() {
        System.out.println("do it from parent");
    }
}

class Child extends Parent { 

    String name;

    void doit() {
        System.out.println("do it from child");
        System.out.println(name + " Parent name is " + super.name);
    }
}
