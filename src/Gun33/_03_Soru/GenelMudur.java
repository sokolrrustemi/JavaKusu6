package Gun33._03_Soru;

public class GenelMudur extends Calisan{
    private double tazminat;

    public GenelMudur(String isim, double maas, double maasKatsayisi, double tazminat) {
        super(isim, maas, maasKatsayisi);
        setTazminat(tazminat);
    }

    @Override
    public double maasHesapla() {
        return super.maasHesapla()+this.tazminat;
    }

    @Override
    public String toString() {
        return super.toString()+"\ntazminat= "+this.tazminat;
//        return "Bordro : " +
//                "\nisim='" + super.getIsim() +
//                "\nmaas=" + super.getMaas() +
//                "\nmaasKatsayisi=" + super.getMaasKatsayisi() +
//                "\ntazminat=" + this.tazminat +
//                "\nÖdenecek Maaş=" + maasHesapla()
//                ;
    }

    public double getTazminat() {
        return tazminat;
    }

    public void setTazminat(double tazminat) {
        // eğer kademesi ise tazminatın yarısı alır
        this.tazminat = tazminat;
    }
}
