class Manager extends Employee {

    String company;

    Manager(String name) {
        super(name);
    }

    Manager(String name, String company) {
        super(name);
        this.company = company;
    }

    void SayHello(String name) {
        System.out.println("Hello " + name + ", nama saya " + this.name + " saya adalah Manager");
    }
}
