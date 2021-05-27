package ShortestPath;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Main{
    public static void main(String [] args) {
        Vlucht vlucht1 = new Vlucht(40, 5);
        Vlucht vlucht2 = new Vlucht(45, 5);
        Vlucht vlucht3 = new Vlucht(60, 5);

        Rit rit1 = new Rit(20);
        Rit rit2 = new Rit(30);
        Rit rit3 = new Rit(40);
        Rit rit4 = new Rit(25);

        Treinrit treinrit1 = new Treinrit(30);
        Treinrit treinrit2 = new Treinrit(45);
        Treinrit treinrit3 = new Treinrit(60);

        ArrayList<Stap> stappen1 = new ArrayList<>();
        stappen1.add(vlucht1);
        stappen1.add(rit3);
        stappen1.add(treinrit1);

        ArrayList<Stap> stappen2 = new ArrayList<>();
        stappen2.add(vlucht2);
        stappen2.add(treinrit2);

        ArrayList<Stap> stappen3 = new ArrayList<>();
        stappen3.add(rit2);
        stappen3.add(treinrit3);
        stappen3.add(rit4);

        ArrayList<Stap> stappen4 = new ArrayList<>();
        stappen4.add(rit1);
        stappen4.add(vlucht3);

        Reis reis1 = new Reis(stappen1);
        Reis reis2 = new Reis(stappen2);
        Reis reis3 = new Reis(stappen3);
        Reis reis4 = new Reis(stappen4);

        PriorityQueue<Reis> pQueue = new PriorityQueue<>();
        pQueue.add(reis1);
        pQueue.add(reis2);
        pQueue.add(reis3);
        pQueue.add(reis4);

        System.out.println(pQueue);

    }
}
