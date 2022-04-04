package aliif.arief.data;

public class Fortuner implements Car, Maintenance {  
    
    public void drive() {
        System.out.println("fortuner menyetir");
    }

    public int getTire() {
        return 6;
    }

    public String getBrand() {
        return "toyota";
    }

    public boolean IsMaintenance() {
        return false;
    }
}
