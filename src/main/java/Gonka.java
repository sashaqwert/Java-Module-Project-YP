public class Gonka {
    Automobile[] autos;

    public Gonka(Automobile[] autos) {
        this.autos = autos;
    }

    public Automobile startAndGetLeader(int hours) {
        double max_distance = -1.0;
        Automobile leader = null;
        for (Automobile a : autos) {
            double distance = a.calculateDistance(hours);
            if (distance > max_distance) {
                max_distance = distance;
                leader = a;
            }
        }
        return leader;
    }
}
