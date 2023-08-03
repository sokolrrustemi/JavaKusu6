package Gun39._03_Soru;

public class Kedi extends Hayvan{

    public Kedi(String isim, boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);
    }

    @Override
    void yiyecegi() {
        System.out.println("mama ve balık yer");
    }

    @Override
    void yemekMiktari() {
        System.out.println("100 gr");
    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println("16 saat");
    }

    @Override
    void sesi() {
        System.out.println("miyav");
    }
}
