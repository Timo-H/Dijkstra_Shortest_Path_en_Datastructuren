package ShortestPath;

import java.util.ArrayList;

public class Reis implements Comparable<Reis>{
    ArrayList<Stap> stappen;

    public Reis(ArrayList<Stap> stappen) {
        this.stappen = stappen;
    }

    public ArrayList<Stap> getStappen() {
        return stappen;
    }

    public int getZwaarte() {
        int weight = 0;
        for (Stap stap : getStappen()) {
            weight += stap.getZwaarte();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Reis: " +
                "  Stappen: " + getStappen() +
                '}';
    }

    @Override
    public int compareTo(Reis other) {
        return Integer.compare(getZwaarte(), other.getZwaarte());
    }
}
