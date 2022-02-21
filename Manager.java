class Manager {

    String name;
    String company;

    Manager(String name) {
        this.name = name;
    }

    Manager(String name, String company) {
        this.name = name;
        this.company = company;
    }

    void SayHello(String name) {
        System.out.println("Hello " + name + ", nama saya " + this.name + " saya adalah Manager");
    }
}
