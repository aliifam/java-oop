class VicePres extends Manager {

    VicePres(String name) {
        super(name);
    }

    void SayHello(String name) {
        System.out.println("Hello " + name + ", nama saya " + this.name + " saya adalah VP"); //method overriding
    }
}
