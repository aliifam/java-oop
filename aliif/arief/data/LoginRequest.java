package aliif.arief.data;

public record LoginRequest(String username, String password) {

    public LoginRequest{
        System.out.println("membuat login requiest");
    }

    public LoginRequest(String username){
        this(username, "");
    }

    public LoginRequest(){
        this("", "");
    }
}
