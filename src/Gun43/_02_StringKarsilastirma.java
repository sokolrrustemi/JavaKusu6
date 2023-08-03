package Gun43;

public class _02_StringKarsilastirma {
    public static void main(String[] args) {
        String cumle1="Bugün hava çok güzel";
        String cumle2="Bugün hava çok güzel";

        // İLKEL tipleri karşılaştırdığından 2 sinde de DEĞERLERİ KARŞILAŞTIRIR
        // ÇÜNKÜ başka bir şeyi yok.
        if (cumle1 ==  cumle2)
            System.out.println("cumle 1 ve cumle 2 eşit");
        else
            System.out.println("cumle 1 ve cumle 2 eşit DEĞİL");

        if (cumle1.equals(cumle2))
            System.out.println("cumle 1 ve cumle 2 eşit");
        else
            System.out.println("cumle 1 ve cumle 2 eşit DEĞİL");

        // Referans Tiplerde ise durum
        // scanner le ekrandan okuduğunda aşağıdaki gibi oluyor
        String cumle3=new String("Bugün hava çok güzel");
        String cumle4=new String("Bugün hava çok güzel");

        //manası referansları AYNIMI
        if (cumle3 ==  cumle4) // == refarns tiplerde REFERANSLARI aynı mı
            System.out.println("cumle 3 ve cumle 4 eşit");
        else
            System.out.println("cumle 3 ve cumle 4 eşit DEĞİL");


        // Değerleri aynı mı
        if (cumle3.equals(cumle4)) // equals HERZAMAN DEĞERLERİ karşılaştırır
            System.out.println("cumle 3 ve cumle 4 eşit");
        else
            System.out.println("cumle 3 ve cumle 4 eşit DEĞİL");


        // ÖZET : Nesne(String) ve referans(dizi,ArrayList,Nesneler) tiplerde
        //        HERZAMAN EQUALS kullanılır.
        //        İlkel (Sayısal, boolean) tiplerde == kullanılır

    }
}
