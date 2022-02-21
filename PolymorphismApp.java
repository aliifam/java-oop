public class PolymorphismApp {
    public static void main(String[] args) {
        
        Employee employee = new Employee("Aliif");
        employee.SayHello("Arief");

        employee = new Manager("Aliif");
        employee.SayHello("Arief");

        employee = new VicePres("Aliif");
        employee.SayHello("Arief");

        sayHello(new Employee("Aliif"));
        sayHello(new Manager("Arief"));
        sayHello(new VicePres("Aliif"));
    }
    
    static void sayHello(Employee employee) {

        if (employee instanceof VicePres) {
            VicePres vp = (VicePres) employee;
            System.out.println("Hi Vice President " + vp.name);
        } else if (employee instanceof Manager) { //type check
            Manager manager = (Manager) employee; //casting datatype
            System.out.println("Hi Manager " + manager.name);
        } else {
            System.out.println("Hi employee " + employee.name);
        }
    }
}
