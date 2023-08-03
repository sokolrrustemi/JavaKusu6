package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _01_Java2DArrays {
    public static void main(String[] args) {
        // Günün Sorusu :  3x2 lik bir diziyi kullanıcıdan sayı alarak
        // doldurduktan sonra sadece tek elemenlarını tek boyutlu bir
        // diziye atayınız.

        Scanner oku=new Scanner(System.in);

        int[][] tablo=new int[3][2]; // 3 satır 2 sütun
        int tekMik=0;

        // okuma işlemi yapıldı, tablonun tüm hücreleri sayı ile dolduruldu
        for (int i = 0; i < 3; i++) { // satir

            for (int j = 0; j < 2; j++) { // sütun
                System.out.print("Sayi giriniz=");
                tablo[i][j]=oku.nextInt(); // 00 01 - 10 11 - 20 21

                if (tablo[i][j] % 2 == 1)
                    tekMik++;
            }

        }

        int[] tekler=new int[tekMik]; // teklerin miktarı kadar bir dizi tanımlandı

        int teklerIndex=0;
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 2; j++) {

                if (tablo[i][j]%2 == 1) {
                    tekler[teklerIndex]=tablo[i][j];
                    teklerIndex++;
                }

            }
        }

        System.out.println(Arrays.toString(tekler));









    }
}
