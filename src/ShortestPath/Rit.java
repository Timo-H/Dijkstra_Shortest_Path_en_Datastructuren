package ShortestPath;

public class Rit extends Stap{
    private final int afstand;

    public Rit(int afstand) {
        this.afstand = afstand;
    }

    public int getAfstand() {
        return afstand;
    }

    @Override
    public int getZwaarte() {
        return getAfstand()*2;
    }

    @Override
    public String toString() {
        return "\nRit: " +
                "\nAfstand: " + getAfstand() +
                "\nTotale zwaarte: " + getZwaarte();
    }
}
