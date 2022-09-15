package hu.petrik.firstjavaoop.pont;

public class Pont {
    private int x;
    private int y;

    public Pont() {
        this.x = 0;
        this.y = 0;
    }

    public Pont(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public Pont(int n) {
        this.y = koordinataGeneralasa(n);
        this.x = koordinataGeneralasa(n);
    }

    private int koordinataGeneralasa(int n) {
        return (int) (Math.random() * ((2 * n) + 1)) - n;
    }

    public double getOrigotolMertTavolsag() {
        //négyzetgyök SQuareRooT \\ hatványozás - POWer
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    public double ketPontTavolsaga(Pont p) {
        return this.x * p.x + this.y * p.y;
    }

    public int siknegyed(Pont p) {
        return p.siknegyedBehatarolas(p);
    }

    private int siknegyedBehatarolas(Pont p) {
        int balfelso = 1;
        int balalso = 2;
        int jobbalso = 3;
        int jobbfelso = 4;
        if (p.x > 0 && p.y > 0) {
            return jobbfelso;
        }
        else if (p.x > 0 && p.y < 0) {
            return jobbalso;
        }
        else if (p.x < 0 && p.y < 0) {
            return balalso;
        }
        else if (p.x < 0 && p.y > 0) {
            return balfelso;
        }
        return 0;
    }

    @Override
    public String toString() {
        // return "Pont{" + "x=" + x + ", y=" + y + '}';
        return String.format("(%d,%d)", this.x, this.y);
    }
}