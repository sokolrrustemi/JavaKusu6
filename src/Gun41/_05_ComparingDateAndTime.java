package Gun41;

import java.time.LocalDate;

public class _05_ComparingDateAndTime {
    public static void main(String[] args) {
        LocalDate buGun=LocalDate.now();
        LocalDate dun=buGun.minusDays(1);

        boolean sonraMi= buGun.isAfter(dun); //bugün dünden sonra mi
        System.out.println("sonraMi = " + sonraMi);

        boolean onceMi= buGun.isBefore(dun); //bugün dünden önce mi
        System.out.println("onceMi = " + onceMi);

        boolean esitMi= buGun.isEqual(dun); //bugün düne eşit mi
        System.out.println("esitMi = " + esitMi);

        boolean artikYilMi= buGun.isLeapYear(); // bugün un bulundu yıl artık yıl mı
        System.out.println("artikYilMi = " + artikYilMi);
    }
}
