package homework40;

public class Drink {
    private String name;
    private String type;
    private double volume;

    public Drink(String name, String type, double volume) {
        this.name = name;
        this.type = type;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Drink " +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", volume=" + volume;
    }
}
