public class ParentApp {
    public static void main(String[] args) {
        
        Child child = new Child();
        child.name = "Aliif";
        child.doit();
        System.out.println(child.name);

        Parent parent = (Parent) child;
        parent.name = "Arief";
        parent.doit(); //method tetap diambil dari method evrriding object child
        System.out.println(parent.name); //
    }
}
