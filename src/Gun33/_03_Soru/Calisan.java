package Gun33._03_Soru;

public class Calisan {
    private String isim;
    private double maas;
    private double maasKatsayisi;

    public Calisan(String isim, double maas, double maasKatsayisi) {
        setIsim(isim);
        setMaas(maas);
        setMaasKatsayisi(maasKatsayisi);
    }

    public double maasHesapla()
    {
        return this.maas*this.maasKatsayisi;
    }

    @Override
    public String toString() {
        return "Bordro : " +
                "\nisim='" + this.isim +
                "\nmaas=" + this.maas +
                "\nmaasKatsayisi=" + this.maasKatsayisi +
                "\nÖdenecek Maaş=" + maasHesapla()
                ;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public double getMaasKatsayisi() {
        return maasKatsayisi;
    }

    public void setMaasKatsayisi(double maasKatsayisi) {
        this.maasKatsayisi = maasKatsayisi;
    }
}
