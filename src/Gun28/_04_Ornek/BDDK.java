package Gun28._04_Ornek;

public class BDDK {
    public static void main(String[] args) {
        Banka b1 = new Banka();
        b1.ad = "Ziraat";
        b1.kurulusYili = 1880;
        b1.subeSayisi = 1000;

        Banka b2 = new Banka("Garanti", 1946, 700);
        Banka b3 = new Banka("Akbank", 2000);

        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);
    }
}
