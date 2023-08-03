package Gun30._02_FinalVariables.Ornek2;

public class Vatandas {
    final int TcNo;
    String isim;
    String adres;

    private static int TcNoSayac=1;

    public Vatandas(String isim, String adres) {
        this.isim = isim;
        this.adres = adres;
        this.TcNo = TcNoSayac++;
    }

    @Override
    public String toString() {
        return "TcNo=" + TcNo +
                ", isim='" + isim + '\'' +
                ", adres='" + adres + '\''
                ;
    }
}
