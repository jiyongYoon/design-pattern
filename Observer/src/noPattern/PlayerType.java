package noPattern;

public enum PlayerType {
    ODD("Odd"),
    EVEN("Even");

    private String type;
    PlayerType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
}
