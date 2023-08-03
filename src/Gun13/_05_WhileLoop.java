package Gun13;

import java.util.Scanner;

public class _05_WhileLoop {
    public static void main(String[] args) {
        //Girilen  5 tam sayının toplamının sonucunu yazdırınız

        Scanner oku=new Scanner(System.in);

        int sayac=1;
        int toplam=0;
        while(sayac<=5){

            System.out.print(sayac+".sayi giriniz=");
            int sayi=oku.nextInt();
            toplam=toplam+sayi;

            sayac++; // sayac=sayac+1;   ++sayac
        }

        System.out.println("toplam = " + toplam);


    }
}
