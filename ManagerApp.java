public class ManagerApp {
    public static void main(String[] args) {
        
        var manager = new Manager("Aliif");
        manager.name = "Aliif";
        manager.SayHello("Arief");

        var vp = new VicePres("Udin");
        vp.name = "Maulana";
        vp.SayHello("Amiin");

        System.out.println(manager);
        System.out.println(manager.toString());
        System.out.println(vp);
        System.out.println(vp.toString());
    }
}
