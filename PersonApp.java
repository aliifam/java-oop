public class PersonApp {
    public static void main(String[] args) {
        
        var person1 = new Person("Aliif", "TRPL");
        //person1.university = "UGM"; would be error because final variabel

        System.out.println(person1.name);
        System.out.println(person1.major);
        System.out.println(person1.university);

        person1.SayHello("budi");

        Person person2 = new Person("Arief"); //hasil overloding constructor
        person2.SayHello("bagus");

        Person person3;
        person3 = new Person(); //hasil overloding constructor
        person3.name = "Maulana";
        person3.SayHello("bambang");
    }
}
