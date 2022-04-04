package aliif.arief.application;

import aliif.arief.data.HelloWorld;

public class HWApp {
    public static void main(String[] args) {
        
        HelloWorld english = new HelloWorld() { //anonymus class implementation

            public void sayHello(){
                System.out.println("hello");
            }

            public void sayHello(String name) {
                System.out.println("Hello, " + name);
            }
        };

        english.sayHello();
        english.sayHello("ALiif");
    }
}
