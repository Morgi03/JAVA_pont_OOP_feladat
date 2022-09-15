package hu.petrik.firstjavaoop.pont;

public class Pont {
    private int x;
    private int y;

    public Pont() {
        x = 0;
        y = 0;
    }

    public Pont(int x, int y) {
        x = this.x;
        y = this.y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Pont(int n) {
        this.x = (int) (Math.random() * (2 * n) + 1 ) - n;
    }

    private int koordinataGeneralasa(int n){
       return this.x = (int) (Math.random() * (2 * n) + 1 ) - n;
    }

    @Override
    public String toString() {
        // return "Pont{" + "x=" + x + ", y=" + y + '}';
        return String.format("(°d,°d)", this.x, this.y);
    }
}