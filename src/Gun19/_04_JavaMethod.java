package Gun19;

public class _04_JavaMethod {
    // metodların yazılabileceği yer

    public static void main(String[] args) { // ana metod, diğer metodlardan buranın içinden çağrılacak
        int enb=Math.max(5,6); // max metodu değer/ler almış, geriye büyük olanı vermiş
        double rndSayi=Math.random();  // hiç bir şey almıyor , sadece veriyor

        System.out.println("Merhaba Dünya"); // veri alıyor, götürüp ekrana yazıyor
        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");

        merhabaYaz(); // kullanımı kolay, çağırması kolay, tekrar tekrar kulanabilirsin
        merhabaYaz(); // mainin daha kolay anlaşılabilir olur. temiz kod sistemi
        merhabaYaz(); // fonksiyonu çağırma şekli
    }

    // metodların yazılabileceği yer
    public static void merhabaYaz(){
        System.out.println("Merhaba Dünya : metoddan");
    }


}
