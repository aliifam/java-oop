package aliif.arief.data;

public enum Level {
    
    STANDART("level standart"),
    PREMIUM("level premium"),
    VIP("level vip");

    private String description;

    Level(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
