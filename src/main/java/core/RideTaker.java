package core;

public class RideTaker {
    public String name;
    public float rating;

    public String getName() {
        return name;
    }

    public float getRating() {
        return rating;
    }

    public RideTaker(String name, float rating) {
        this.name = name;
        this.rating = rating;
    }
}
