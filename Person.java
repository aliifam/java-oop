class Person {
    String name;
    String major;
    final String university = "GadjahMada";

    Person(String name, String major) { //constructor
        this.name = name;
        this.major = major;
    }

    Person(String name) { //constructor overloading
        this(name, null); //call other constructor
    }

    Person() { //constructor overloading
        this(null); //call other constructor
    }

    void SayHello(String name) {
        System.out.println("Halo " + name + ", perkenalkan nama saya " + this.name);
    }
}
