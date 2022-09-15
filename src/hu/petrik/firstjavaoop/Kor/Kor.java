package hu.petrik.firstjavaoop.Kor;

import java.util.Arrays;

public class Kor {
    private int kx;
    private int ky;
    private int r;

    public Kor(int kx, int ky, int r) {
        this.kx = kx;
        this.ky = ky;
        this.r = r;
    }
    public Kor(int r) {
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

    public int getR() {
        return r;
    }

    private int randomKorErtekgeneralasa(int value){
        int num=0;
                while (num == 0){
                    num = (int) (Math.random() * ((2 * value) + 1)) - value;
                }
                return num;
    }
    public double Terulet(Kor k){
        return k.r*k.r*Math.PI;
    }
    public double Kerulet(Kor k){
        return 2*k.r*Math.PI;
    }

    public Kor korNagyitasKicsinyites(){
        return null;
    }

    public String korAdatai(Kor k){
        return "("+k.getKx()+","+k.getKy()+","+k.getR()+")";
    }

    public Kor legnagyobbTeruletuKor(Kor[] kt){

    }

}
