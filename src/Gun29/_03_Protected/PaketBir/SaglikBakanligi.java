package Gun29._03_Protected.PaketBir;

public class SaglikBakanligi {
    public static void main(String[] args) {
        Doctor dok1=new Doctor();
        dok1.hastaneAd="Numune Hastanesi";
        dok1.adi="ismet";
        dok1.bolumu="dahiliye";
        //dok1.sicilNo private

        Doctor dok2=new Doctor("mehmet");
    }

}
