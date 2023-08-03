package Gun43;

import java.util.Scanner;

public class _04_JavaRuntimeException {
    public static void main(String[] args) {

        boolean dogruCalisti;

        do {
            try {  // hata bölgesine şerit i çektik
                Scanner oku = new Scanner(System.in);

                System.out.print("Sayi1=");
                int sayi1 = oku.nextInt();

                System.out.print("Sayi2=");
                int sayi2 = oku.nextInt();

                int bolum = sayi1 / sayi2;
                System.out.println("bolum = " + bolum);
                dogruCalisti = true;
            } catch (Exception hata)  // hata olursa yakala ve aşağıdaki bölümü çalıştır
            {  // hata mesalarını hata isimli Eception cinsinden değişkene attım
                System.out.println("hata oluştu");
                System.out.println("hata=" + hata.getMessage());
                System.out.println("Lütfen 2.sayıyı 0 vermeyiniz.");
                dogruCalisti = false;
            }

        } while (!dogruCalisti); // doğruÇalışmadıysa dön


    }
}
