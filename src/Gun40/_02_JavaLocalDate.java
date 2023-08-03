package Gun40;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class _02_JavaLocalDate {
    public static void main(String[] args) {
        // LocalDate Sadece gun ay yıl bilgisini tutar

        LocalDate tarih=LocalDate.now(); // şu andaki tarihi ver

        DateTimeFormatter oz6= DateTimeFormatter.ofPattern("MMMM dd EEEE yyyy");
        System.out.println("tarih MMMM dd EEEE yyyy = " + tarih.format(oz6));

        System.out.println("*** başka dilde formatta gösterim ***");
        // lokalden aldığım tarihi başka dilde formatta gösterimi
        System.out.println("Almanca Tarih="+ tarih.format( oz6.withLocale(Locale.GERMANY) ));

        // Lokalizasyon tanımlaması ne demek
        // en-US : Amerikanı nın İngilizce konuşulan lokalizasyonu (Bölgesi)
        // en-UK : İngiltere nin İngilizce konuşulan lokalizasyonu (Bölgesi)
        // fr-CA : Kanada nın fransızca konuşulan lokalizasyonu (Bölgesi)
        // en-CA : Kanada nın ingilizce konuşulan lokalizasyonu (Bölgesi)
        // tr-TR : Türkiye nin Türkçe konuşulan bölgesi

        Locale lCince= new Locale("zh","CH"); // Çinin zh konuşulan bölgesi
        System.out.println("Çince Tarih=" + tarih.format( oz6.withLocale(lCince) ));

         // Kullanılabilir Local leri bulma
        Locale[] kullanilabilirLokaller= Locale.getAvailableLocales();

        for(Locale l : kullanilabilirLokaller){

            if (!l.getDisplayCountry().toLowerCase().contains("tur")) continue;

            System.out.print("Dili="+ l.getDisplayLanguage());
            System.out.print(",Ülkesi="+ l.getDisplayCountry());
            System.out.print(",Dili="+ l.getLanguage());
            System.out.print(",Ülkesi="+ l.getCountry());
            System.out.println();
        }

        Locale lTurkiye=new Locale("tr","TR");
        System.out.println("Türkçe Tarih=" + tarih.format( oz6.withLocale(lTurkiye) ));

        System.out.println("\n*****************");
        // tarih=2053-5-20; gibi kendimiz bir tarihi nasıl set ederiz
        LocalDate tarih1= LocalDate.of(2053,5,20);
        LocalDate tarih2= LocalDate.of(2053, Month.MAY, 20);
        System.out.println("tarih2.format(oz6) = " + tarih2.format(oz6));



    }
}
