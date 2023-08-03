package Gun16;

import java.util.Scanner;

public class _03_JavaArray {
    public static void main(String[] args) {
        // 50 kişilik bir sınıfın notlarını giriniz ve ortalamadan büyük
        // kaç not olduğunu bulunuz ve bunları yazdırnız.

        Scanner oku=new Scanner(System.in);
        double toplam=0;
        int[] notlar=new int[5]; // 50 tane int kutusu oluşturuldu hafızada
        int gecenler=0;

        for (int i = 0; i < notlar.length; i++) {

            System.out.print("notu giriniz=");
            notlar[i] = oku.nextInt();

            toplam = toplam + notlar[i];
        }

        double ort= toplam / notlar.length;

        for (int i = 0; i < notlar.length; i++) {

            if (notlar[i] >= ort) {
                System.out.println("Geçen not="+notlar[i]);
                gecenler++;
            }
        }

        System.out.println("ort = " + ort);
        System.out.println("gecenler = " + gecenler);

    }
}
