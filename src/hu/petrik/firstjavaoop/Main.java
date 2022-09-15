package hu.petrik.firstjavaoop;

import hu.petrik.firstjavaoop.pont.Pont;

public class Main {
    public static void main(String[] args) {

        // Pont feladat kezdete

        Pont p1 = new Pont();
        Pont p2 = new Pont(0, 2);
        Pont p3 = new Pont(3, 4);
        Pont p4 = new Pont(100);
        System.out.println("Felvett pár pont koordinátája:");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        System.out.println("Pontok tömb kiíratása:");
        Pont[] pontok = new Pont[10];
        for (int i = 0; i < pontok.length; i++) {
            pontok[i] = new Pont(100);
        }
        for (Pont p : pontok) {
            System.out.println(p);
        }
        //Origótól legtávolabb eső pont
        int legtavolabbiPontIndex = 0;
        for (int i = 0; i < pontok.length; i++) {
            if (pontok[legtavolabbiPontIndex].getOrigotolMertTavolsag() < pontok[i].getOrigotolMertTavolsag()) {
                legtavolabbiPontIndex = i;
            }
        }
        System.out.printf("A legtávolabbi pont az origótól a(z) %d. pont, koordinátái: %s, origótól mért távolsága: %.3f\n", (legtavolabbiPontIndex + 1), pontok[legtavolabbiPontIndex], pontok[legtavolabbiPontIndex].getOrigotolMertTavolsag());


        //saját megoldást igénylő feladatok

        Pont pont1 = new Pont(2, 5);
        Pont pont2 = new Pont(7, 10);
        Pont p0 = new Pont();
        System.out.printf("A %s pont és a %s pont távolsága: %.3f\n", pont1, pont2, pont1.ketPontTavolsaga(pont2));
        System.out.printf("A %s pont a következő síknegyedben helyezkedik el: %s.\n", pont1, p0.siknegyed(pont1));


        // Pont feladat vége

        // Kör feladat kezdete




    }
}