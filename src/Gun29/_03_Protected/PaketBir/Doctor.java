package Gun29._03_Protected.PaketBir;

public class Doctor {
    public String hastaneAd; // public : diğer paketlerden erişim izni
                                                                // verildi
    String adi;              // default
    protected String bolumu; // default aynı
    private String sicilNo;  // private sadece class ın içinden erişilebilir.

    Doctor() {  // sadece kendi paketindekiler erişebilir
    }

    public Doctor(String adi) { // diğer tüm paketlerden de erişilebilir
        this.adi = adi;
    }
}
