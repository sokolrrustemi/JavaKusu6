package Gun30._04_Soru;

import java.util.Scanner;

public class SoruMain {

    public static void main(String[] args) {
        int gun=0;
        int saat=0;
        int dak=0;

        Scanner oku=new Scanner(System.in);
        System.out.print("Gun="); gun=oku.nextInt();
        System.out.print("Saat="); saat=oku.nextInt();
        System.out.print("Dakika="); dak=oku.nextInt();

        int toplamSaniye=
                gun
                * Sabitler.birGundekiSaatSayisi
                * Sabitler.birSaattekiDakikaSayisi
                * Sabitler.birDakikadakiSaniSayisi
                +
                saat
                * Sabitler.birSaattekiDakikaSayisi
                * Sabitler.birDakikadakiSaniSayisi
                +
                dak
                * Sabitler.birDakikadakiSaniSayisi;

        System.out.println("toplamSaniye = " + toplamSaniye);

        //2.Yöntem
        System.out.println("toplamSaniye = " +
                Sabitler.hesapla(gun,saat,dak));



    }
}
