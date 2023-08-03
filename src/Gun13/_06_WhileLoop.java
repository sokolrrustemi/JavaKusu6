package Gun13;

import java.util.Scanner;

public class _06_WhileLoop {
    public static void main(String[] args) {
        // Girilen 6 sayıdan sadece pozitif olanlarının
        // toplamını bulunuz
        Scanner oku=new Scanner(System.in);

        int sayac=1;
        int toplam=0;
        while (sayac <= 6){

            System.out.print("sayi giriniz=");
            int sayi=oku.nextInt();
            if (sayi>0)
               toplam=toplam+sayi;

            sayac=sayac+1;
        }

        System.out.println("toplam = " + toplam);

    }
}
