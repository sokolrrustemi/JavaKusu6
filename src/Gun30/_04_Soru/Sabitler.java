package Gun30._04_Soru;

public class Sabitler {
    public final static int birGundekiSaatSayisi= 24;
    public final static int birSaattekiDakikaSayisi= 60;
    public final static int birDakikadakiSaniSayisi= 60;


    public static int hesapla(int gun, int saat, int dak){
        int toplamSaniye=
                gun
                        * Sabitler.birGundekiSaatSayisi
                        * Sabitler.birSaattekiDakikaSayisi
                        * Sabitler.birDakikadakiSaniSayisi
                        +
                        saat
                        * Sabitler.birSaattekiDakikaSayisi
                        * Sabitler.birDakikadakiSaniSayisi
                        +
                        dak
                        * Sabitler.birDakikadakiSaniSayisi;

        return toplamSaniye;
    }
}
