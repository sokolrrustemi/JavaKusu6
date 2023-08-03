package Gun12;

public class _01_JavaRandom {
    public static void main(String[] args) {
        // Math.Random() : double sayı üretir. 0 - 0,999999999 arası üretiyor.

        double randSayi= Math.random();  // 0 - 0,9999999999999
        System.out.println("randSayi = " + randSayi);

        // 0 - 0,9999999999999
        // 10 la çarparsam
        // 0 - 9,9999999999999
        // (int) 0-9
        int rndTamSayi= (int) (randSayi*10);
        System.out.println("rndTamSayi = " + rndTamSayi);
    }
}
