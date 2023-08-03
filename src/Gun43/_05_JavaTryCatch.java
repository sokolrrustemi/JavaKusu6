package Gun43;

import java.time.LocalDate;
import java.time.Month;

public class _05_JavaTryCatch {
    public static void main(String[] args) {
        System.out.println("Program çalışmaya başladı");

        try {// dene, hatanın başladığı yerin üstüne konur
            LocalDate tarih = LocalDate.of(2023, Month.FEBRUARY, 30); // Runtime Error

        }// hata olduğu zaman programı kırma
        catch (Exception ex) // ex isimli değişkende oluşan hataların bilgisi atanıyor
        { //hata oldugunda yapılması istenenler buraya yazılıyor
            System.out.println("Hata oluştu"+ex);
            System.out.println("ex.getMessage() = " + ex.getMessage());
            // log tutabilirsin, ekranın fotoğrafını alabilirsin.
        }

        System.out.println("program bitti");

        // Kursdaki hata durum yönetimi
        try{
            // Java ve Toolları çalışmaya devam et
            // Konuları grupla çalışmaya devam
        } // anlamadığın yerler mi oldu , runtime error
        catch(Exception ex){
            // hatanın sebebini anla
            // derse daha fazla odaklan
            // anlamadığın yerleri sor,
            // videoları tekrar izle
            //grup çalışmasına devam et
        }



    }





}
