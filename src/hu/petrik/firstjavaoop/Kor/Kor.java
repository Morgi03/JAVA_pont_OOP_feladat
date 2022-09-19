package hu.petrik.firstjavaoop.Kor;

import java.util.Arrays;

public class Kor {
    private int kx;
    private int ky;
    private double r;

    public Kor(int kx, int ky, double r) {
        this.kx = kx;
        this.ky = ky;
        this.r = r;
    }

    public Kor(double r) {
        this.kx = 0;
        this.ky = 0;
        this.r = r;
    }

    public Kor() {
        int generatenumber = 100;
        this.kx = randomKorErtekgeneralasa(generatenumber);
        this.ky = randomKorErtekgeneralasa(generatenumber);
        this.r = randomKorErtekgeneralasa(generatenumber);
    }

    public int getKx() {
        return kx;
    }

    public int getKy() {
        return ky;
    }

    public double getR() {
        return r;
    }

    private int randomKorErtekgeneralasa(int value) {
        int num = 0;
        while (num == 0) {
            num = (int) (Math.random() * ((2 * value) + 1)) - value;
        }
        return Math.abs(num);
    }

    public double Terulet() {
        return  this.r * this.r * Math.PI;
    }

    public double Kerulet() {
        return 2 * this.r * Math.PI;
    }

    public Kor korNagyitasKicsinyites(double hanyszoros, boolean nagyitas) {
        if (nagyitas) {
            Kor ujkor = new Kor(this.kx, this.ky, this.r * hanyszoros);
            return ujkor;
        } else {
            Kor ujkor2 = new Kor(this.kx, this.ky, this.r / hanyszoros);
            return ujkor2;
        }
    }

    public String korAdatai() {
        return "(" + this.getKx() + "," + this.getKy() + "," + this.getR() + ")";
    }

    public Kor legnagyobbTeruletuKor(Kor[] kt) {
        int index = 0;
        for (int i = 0; i < kt.length; i++) {
            if (kt[index].Terulet() < kt[i].Terulet()) {
                index = i;
            }
        }
        return kt[index];
    }

}
