package Gun29._03_Protected.PaketIki;

import Gun29._03_Protected.PaketBir.Doctor;

public class OzelHastane {
    public static void main(String[] args) {

        Doctor dok1 = new Doctor("Ayşe");
        dok1.hastaneAd = "Özel İstanbul hastanesi";

        // Doctor dok2=new Doctor();
        // default sadece kendi paketinde ulaşılabilir
    }

}
