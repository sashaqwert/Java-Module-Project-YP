public class Automobile {
    public String name;
    public double speed; // 0..250

    public Automobile(String name) {
        this.name = name;
    }

    public Automobile(String name, double startSpeed) {
        this.name = name;
        this.speed = startSpeed;
    }

    public void stop() {
        this.speed = 0;
    }

    public double calculateDistance(int hours) {
        return hours * speed;
    }
}
