package ShortestPath;

public class Treinrit extends Stap{
    private final int tijd;

    public Treinrit(int tijd) {
        this.tijd = tijd;
    }

    public int getTijd() {
        return tijd;
    }

    @Override
    public int getZwaarte() {
        return getTijd()*2;
    }

    @Override
    public String toString() {
        return "\nTreinrit: " +
                "\nTijd: " + getTijd() +
                "\nTotale zwaarte: " + getZwaarte();
    }
}
