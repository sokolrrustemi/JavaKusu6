package Gun39._02_Soru;

public class ABMain {
    public static void main(String[] args) {
        A a=new A();
        System.out.println("a.mesaj = " + a.mesaj);//A

        B b=new B(); //B class , b: nesne
        System.out.println("b.mesaj = " + b.mesaj);//B

        A a2=new A();
        System.out.println("a2.mesaj = " + a2.mesaj);//A
        a2.mesaj="sadece merhaba"; // a nesnesine etkisi yok
        //çıktısı ne olur
    }
}
