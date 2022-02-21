public class ManagerApp {
    public static void main(String[] args) {
        
        var manager = new Manager("Aliif");
        manager.name = "Aliif";
        manager.SayHello("Arief");

        var vp = new VicePres("Udin");
        vp.name = "Maulana";
        vp.SayHello("Amiin");

    }
}
