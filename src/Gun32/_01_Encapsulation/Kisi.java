package Gun32._01_Encapsulation;

public class Kisi {
    private String ad; // 25 karakter sınırı
    private String soyad; // 25 karakter sınırı
    private int yas;

    public void yasAta(int yas)
    {
        if (yas<0)
            System.out.println("Hatalı giris");
        else
            this.yas=yas;
    }

    public void setAd(String ad){
        if (ad.length() < 25)
            this.ad=ad;
        else
            System.out.println("hatalı giris");
    }

    public void setSoyad(String soyad){
        if (soyad.length() < 25)
            this.soyad=soyad;
        else
            System.out.println("hatalı giris");
    }

    public int yasVer(){
        return this.yas;
    }

    public String getSoyad()
    {
        return this.soyad;
    }

    public String getAd()
    {
        return this.ad;
    }

}
