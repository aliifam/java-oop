class Person {
    String name;
    String major;
    final String university = "GadjahMada";

    Person(String paramName, String paramMajor) { //constructor
        name = paramName;
        major = paramMajor;
    }

    Person(String paramName) { //constructor overloading
        this(paramName, null); //call other constructor
    }

    Person() { //constructor overloading
        this(null); //call other constructor
    }

    void SayHello(String paramName) {
        System.out.println("Halo " + paramName + ", perkenalkan nama saya " + name);
    }
}
