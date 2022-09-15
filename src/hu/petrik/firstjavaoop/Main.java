package hu.petrik.firstjavaoop;

import hu.petrik.firstjavaoop.pont.Pont;

public class Main {
    public static void main(String[] args) {
        Pont p1 = new Pont(1, 3);
        Pont p2 = new Pont(0, 0);
        Pont p3 = new Pont(3, 4);
        Pont p4 = new Pont(100);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        Pont[] pontok = new Pont[10];
        for (int i = 0; i < pontok.length; i++) {
            pontok[1] = new Pont(10);
        }
        for (Pont p : pontok) {
            System.out.println(p);
        }
    }
}