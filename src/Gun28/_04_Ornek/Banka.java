package Gun28._04_Ornek;

public class Banka {
    String ad;
    int subeSayisi;
    int kurulusYili;

    public Banka() {
    }

    public Banka(String ad, int subeSayisi, int kurulusYili) {
        this.ad = ad;
        this.subeSayisi = subeSayisi;
        this.kurulusYili = kurulusYili;
    }

    public Banka(String ad, int kurulusYili) {
        this(ad,kurulusYili,0);
    }

    public Banka(String ad) {
        this(ad,0,0);
    }

    public String toString() {
        return "Banka{" +
                "ad='" + ad + '\'' +
                ", subeSayisi=" + subeSayisi +
                ", kurulusYili=" + kurulusYili +
                '}';
    }
}
