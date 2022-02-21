public class PolymorphismApp {
    public static void main(String[] args) {
        
        Employee employee = new Employee("Aliif");
        employee.SayHello("Arief");

        employee = new Manager("Aliif");
        employee.SayHello("Arief");

        employee = new VicePres("Aliif");
        employee.SayHello("Arief");
    }
}
