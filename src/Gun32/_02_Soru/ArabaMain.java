package Gun32._02_Soru;

public class ArabaMain {
    public static void main(String[] args) {
        Araba a1=new Araba();
        a1.setRenk("kirmizi");
        a1.setModel(2023);
        a1.setKapiSayisi(8);
        a1.setMotorHacmi(1900);

        System.out.println("a1 = " + a1);

        Araba a2=new Araba("siyah", 2045, 5000, 23);
        System.out.println("a2 = " + a2);
    }
}

// KURAL: genel yazılım kuralıdır.
// bütün değişkenler private yapılır.
// yani Kapsulleme ile kullanılır.
// Eğer gerekiyorsa private kaldırılır.