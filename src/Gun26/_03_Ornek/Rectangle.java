package Gun26._03_Ornek;

public class Rectangle {
    int width;
    int length;

    public void cevre() {
        int cevre = (this.width + this.length) * 2;
        System.out.println("cevre = " + cevre);
    }

    public void alan() {
        int alan = this.width * this.length;
        System.out.println("alan = " + alan);
    }

    public int cevre2() {
        int cevre = (this.width + this.length) * 2;
        return cevre;
    }

    public int alan2() {
        int alan = this.width * this.length;
        return alan;
    }

    public void degerAta(int a, int b)
    {
        this.width=a;
        this.length=b;
    }
}
