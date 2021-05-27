package ShortestPath;

public class Vlucht extends Stap{
    final private int prijs;
    final private int kansBagageVerlies;

    public Vlucht(int prijs, int kansBagageVerlies) {
        this.prijs = prijs;
        this.kansBagageVerlies = kansBagageVerlies;
    }

    @Override
    public int getZwaarte() {
        return getPrijs() + getKansBagageVerlies();
    }

    public int getPrijs() {
        return prijs;
    }

    public int getKansBagageVerlies() {
        return kansBagageVerlies;
    }

    @Override
    public String toString() {
        return "\n\nVlucht: " +
                "\nprijs: €" + getPrijs() +
                "\nkansBagageVerlies: " + getKansBagageVerlies() +
                "% \nTotale zwaarte: " + getZwaarte();
    }
}
