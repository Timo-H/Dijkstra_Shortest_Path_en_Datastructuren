package ShortestPath;

public class Vlucht extends Stap{
    double prijs;
    int kansBagageVerlies;

    public Vlucht(double prijs, int kansBagageVerlies) {
        this.prijs = prijs;
        this.kansBagageVerlies = kansBagageVerlies;
    }
}
