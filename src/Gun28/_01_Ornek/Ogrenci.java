package Gun28._01_Ornek;

public class Ogrenci {
    int id;
    String ad;
    String soyad;
    int sinif;

    // yapıcı metodlar : Constructor metodlar
    public Ogrenci()
    {
        System.out.println("nesne oluşturuldu");
    }

    // yapıcı metodlar : Constructor metodlar
    public Ogrenci(int id, String ad, String soyad, int sinif)
    {
        this.id=id;
        this.ad=ad;
        this.soyad=soyad;
        this.sinif=sinif;
    }

    // yapıcı metodlar : Constructor metodlar
    public Ogrenci(int id, String ad, String soyad)
    {
          this(id,ad,soyad,0); // this = Ogrenci, kendisi
//        this.id=id;
//        this.ad=ad;
//        this.soyad=soyad;
//        this.sinif=0;
    }

}
