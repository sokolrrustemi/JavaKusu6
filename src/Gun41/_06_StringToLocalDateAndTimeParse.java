package Gun41;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _06_StringToLocalDateAndTimeParse {
    public static void main(String[] args) {
        // Kullanıcıdan alınan ve string durumundaki time veya tarih
        // bilgisinin time veya tarih bilgisine çevrilmesi

        Scanner oku=new Scanner(System.in);
        System.out.print("Tarih giriniz (25 01 2023) =");
        String strTarih= oku.nextLine();

        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDate tarih= LocalDate.parse(strTarih,f);

        System.out.println("tarih = " + tarih.format(f));
    }
}
