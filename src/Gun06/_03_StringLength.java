package Gun06;

public class _03_StringLength {
    public static void main(String[] args) {
        // StringLength  -> bir Stringin uzunluğunu verir.(Kaç tane harf var)

        String cumle="Bu gün hava çok güzel";

        int uzunluk= cumle.length(); // cumle nini uzunluğu : karakter sayısı

        System.out.println("uzunluk = " + uzunluk);
        System.out.println("uzunluk2 = " + cumle.length());
    }
}
