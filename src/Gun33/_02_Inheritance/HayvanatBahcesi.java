package Gun33._02_Inheritance;

public class HayvanatBahcesi {
    public static void main(String[] args) {
        Kedi kedi1=new Kedi("siyah",3, "tekir");
        System.out.println("kedi1 = " + kedi1);
        kedi1.konustu();

        Kopek kopek1=new Kopek("beyaz", 50,"kangal");
        kopek1.konustu();

        Yilan yilan1=new Yilan("siyah",3,"engerek", 3);
        yilan1.konustu();
        System.out.println("yilan1 = " + yilan1);

        Ordek ordek1=new Ordek("yeşil",3,"gövel", 90);
        ordek1.konustu();
        System.out.println("ordek1 = " + ordek1);

    }
}
