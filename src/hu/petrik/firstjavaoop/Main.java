package hu.petrik.firstjavaoop;

import hu.petrik.firstjavaoop.Kor.Kor;
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
        System.out.printf("A %s pont és a %s pont távolsága: %.3f\n", pont1, pont2, pont1.ketPontTavolsaga(pont2));
        System.out.printf("A %s pont a elhelyezkedése: %s.\n", pont1, pont1.getSiknegyedSzoveges());
        // Pont feladat vége

        // Kör feladat kezdete
        Kor kor1 = new Kor(2,3,5);
        Kor kor2 = new Kor();
        Kor kor3 = new Kor(7,4,45);
        Kor kor4 = new Kor(86,45,32);
        Kor kor5 = new Kor(4,4,4);
        Kor kor6 = new Kor(24,35,23);
        Kor kor7 = new Kor(25,32,32);
        Kor kor8 = new Kor(22);
        Kor kor9 = new Kor(15,15,1);
        Kor kor10 = new Kor(34,34,12);
        Kor[] kortomb = new Kor[10];
        kortomb[0] = kor1;
        kortomb[1] = kor2;
        kortomb[2] = kor3;
        kortomb[3] = kor4;
        kortomb[4] = kor5;
        kortomb[5] = kor6;
        kortomb[6] = kor7;
        kortomb[7] = kor8;
        kortomb[8] = kor9;
        kortomb[9] = kor10;

        System.out.printf("%s kör kerülete: %.3f\n",kor3.korAdatai(),kor3.Kerulet());
        System.out.printf("%s kör területe: %.3f\n",kor5.korAdatai(),kor5.Terulet());
        System.out.printf("%s kör nagyítása 5-tel: %s\n",kor6.korAdatai(),kor6.korNagyitasKicsinyites(5,true).korAdatai());
        System.out.printf("%s kör kicsinyítése 4-gyel: %s\n",kor6.korAdatai(),kor6.korNagyitasKicsinyites(4,false).korAdatai());
        System.out.printf("%s kör (Köradatok)\n",kor2.korAdatai());
        System.out.printf("Legnagyobb területtel rendelkező kör a kortomb nevű tömbben: %s",kor1.legnagyobbTeruletuKor(kortomb).korAdatai());


    }
}