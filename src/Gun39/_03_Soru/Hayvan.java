package Gun39._03_Soru;

public abstract class Hayvan {
    private final int id;
    private String isim;
    private boolean vahsi;
    private String dogumTarihi;

    abstract void yiyecegi();
    abstract void yemekMiktari();
    abstract void gunlukUykuSuresi();
    abstract void sesi();

    private static int sayacID=1;

    public Hayvan(String isim, boolean vahsi, String dogumTarihi) {
        setIsim(isim);
        setVahsi(vahsi);
        setDogumTarihi(dogumTarihi);
        this.id=sayacID++;
    }

    @Override
    public String toString() {
        System.out.println("******");
        System.out.println("ismi = "+ this.isim);
        System.out.print("yiyeceği= "); yiyecegi();
        System.out.print("yemek mik= "); yemekMiktari();
        System.out.print("uyku süresi= "); gunlukUykuSuresi();
        System.out.print("sesi= "); sesi();

        return
                "id=" + id +
                ", vahsi=" + vahsi +
                ", dogumTarihi='" + dogumTarihi + '\'' ;

    }

    public int getId() {
        return id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public boolean isVahsi() {
        return vahsi;
    }

    public void setVahsi(boolean vahsi) {
        this.vahsi = vahsi;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }
}
