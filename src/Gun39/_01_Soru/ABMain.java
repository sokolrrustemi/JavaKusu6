package Gun39._01_Soru;

public class ABMain {
    public static void main(String[] args) {
        A a=new A(); // etkisi yok
        System.out.println("A.mesaj = " + A.mesaj);// A

        B b=new B(); // consructor çalıştı -> static değişkenin değeri değişti
        System.out.println("A.mesaj = " + A.mesaj); // B

        A a2=new A(); // bunu değiştirici bir etkisi yok
        System.out.println("A.mesaj = " + A.mesaj); // B
    }
}
