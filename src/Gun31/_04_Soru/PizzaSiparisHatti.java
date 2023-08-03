package Gun31._04_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaSiparisHatti {

    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        ArrayList<Pizza> siparisler = new ArrayList<>();

        int secim = 0;
        do {
            menu(); // menuyu goster
            secim = oku.nextInt();// secimi oku
            // secime görepizzayı Arrayliste ekle
            switch (secim) {
                case 1:
                    Pizza ps = new Pizza(PizzaSize.SMALL);
                    siparisler.add(ps);
                    break;
                case 2:
                    Pizza pm = new Pizza(PizzaSize.MEDIUM);
                    siparisler.add(pm);
                    break;
                case 3:
                    Pizza pl = new Pizza(PizzaSize.LARGE);
                    siparisler.add(pl);
                    break;
                case 4: siparisYazdir(siparisler);
                    break;
            }


        } while (secim < 5);

    }


    public static void siparisYazdir(ArrayList<Pizza> siparisler)
    {
        int s=0,m=0,l=0;

        for (Pizza p: siparisler)
        {
            switch (p.size){
                case SMALL: s++; break;
                case MEDIUM: m++; break;
                case LARGE: l++; break;
            }
        }
        System.out.println(s+" tane Small Pizza");
        System.out.println(m+" tane Medium Pizza");
        System.out.println(l+" tane Large Pizza");
    }
    public static void menu() {
        System.out.println("*******  Pizza Menu *****");
        System.out.println("1 - Small");
        System.out.println("2 - Medium");
        System.out.println("3 - Large");
        System.out.println("4 - İşleme Al-Siparişi göster");
        System.out.println("5 - Çıkış");
        System.out.print("Seçiminiz=");
    }
}
