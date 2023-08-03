package Gun11;

import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args) {
        // Otopark ücretleri :
        // 3 saate kadar 10 tl, 5 saate kadar 15 tl, 5 den buyukse 20 tl  dir.
        // kullanıcıdan kac saat kaldıgını alarak ucretı yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir saat giriniz=");
        int saat=oku.nextInt();

//        eğer 3 ve 3 den küçükse 10 tl
//        değilse
//        {
//            eğer 5 den küçükse  15 tl
//            değilse  20 tl
//        }

        if ( saat <= 3)
            System.out.println("10 ₺");
        else  // saat>3
        {
             if (saat <=5)
                 System.out.println("15 ₺");
             else
                 System.out.println("20 ₺");
        }



    }
}
