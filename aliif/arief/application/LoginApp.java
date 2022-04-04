package aliif.arief.application;

import aliif.arief.data.LoginRequest;

public class LoginApp {
    public static void main(String[] args) {

        LoginRequest loginrequest = new LoginRequest("Aliif Arief", "rahasia");

        System.out.println(loginrequest);
        System.out.println(loginrequest.username());
        System.out.println(loginrequest.password());

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("Aliif"));
        System.out.println(new LoginRequest("Aliif", "programmer"));
        
    }
}
