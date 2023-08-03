package Gun20;

import java.util.Scanner;
import Tools.MyFunc;

public class _03_JavaMethod {
    public static void main(String[] args) {
        // Kullanıcının gireceği 2 sayıdan büyük olanını bulma işlemini bir metodda
        // yaptıktan sonra main de yazdırınız.

        Scanner oku = new Scanner(System.in);

        System.out.print("1.Sayı=");
        int sayi1 = oku.nextInt();

        System.out.print("2.Sayı=");
        int sayi2 = oku.nextInt();

        int enb=enbBul(sayi1,sayi2);

        enb= MyFunc.enbBul(sayi1,sayi2);//MyFunc

        System.out.println("enb = " + enb);
        int rndSayi=MyFunc.rndTamSayi(10);
    }

    public static int enbBul(int s1,int s2) { // metodun imzası
        int enb=0;

        if (s1>s2)
            enb=s1;
        else
            enb=s2;

        return enb;


         // 2.yöntem
//        if (s1>s2)
//            return s1;
//        else
//            return s2;

        // 2.yöntem
        //return (s1>s2 ? s1 : s2);
    }

}
