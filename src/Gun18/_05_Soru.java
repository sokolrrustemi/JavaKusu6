package Gun18;

import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {
        // 2x3 lük bir tabloyu random 10 a kadar sayılarla doldurunuz.
        // Daha sonra kullanıcıdan bir sayı alınız.Bu sayı tabloda
        // var ise yerini (satir,sütun) yazdırınız.

        int[][] tablo=new int[2][3];

        // random doldurdum
        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 3; j++)
                 tablo[i][j]= (int)(Math.random()*10);

        }

        // yazdırma
        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 3; j++)
                System.out.print( tablo[i][j]+" " );

            System.out.println();
        }

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı giriniz=");
        int arananSayi=oku.nextInt();


        // yazdırma
        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 3; j++) {

                if (tablo[i][j] == arananSayi)
                    System.out.println("satir=" + i + ", sutun=" + j);

            }

        }



    }

}
