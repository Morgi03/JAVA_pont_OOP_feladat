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
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }

    private int getSiknegyedValue() {
        int siknegyed = 0;
        if (this.x > 0 && this.y > 0) {
            siknegyed = 4;
        } else if (this.x > 0 && this.y < 0) {
            siknegyed = 3;
        } else if (this.x < 0 && this.y < 0) {
            siknegyed = 2;
        } else if (this.x < 0 && this.y > 0) {
            siknegyed = 1;
        } else if (this.x == 0 && this.y != 0) {
            siknegyed = 5;
        } else if (this.x != 0 && this.y == 0) {
            siknegyed = 6;
        }
        return siknegyed;
    }

    public String getSiknegyedSzoveges()
    {
        int siknegyed = this.getSiknegyedValue();
        String siknegyedSzoveges = "";
        switch (siknegyed){
            case 0:
                siknegyedSzoveges = "origo";
                break;
            case 1:
                siknegyedSzoveges = "bal felső síknegyed";
                break;
            case 2:
                siknegyedSzoveges = "bal alsó síknegyed";
                break;
            case 3:
                siknegyedSzoveges = "jobb alsó síknegyed";
                break;
            case 4:
                siknegyedSzoveges = "jobb felső síknegyed";
                break;
            case 5:
                siknegyedSzoveges = "függőleges tengely";
                break;
            case 6:
                siknegyedSzoveges = "vizszintes tengely";
                break;
        }
        return siknegyedSzoveges;
    }

    @Override
    public String toString() {
        // return "Pont{" + "x=" + x + ", y=" + y + '}';
        return String.format("(%d,%d)", this.x, this.y);
    }
}