package Gun15;

public class _07_JavaNestedLoop {
    public static void main(String[] args) {
        // Aşağıdaki görünümü tek yıldız kullanarak yazdırınız.
        //  ***** 1
        //  ***** 2
        //  ***** 3
        //  ***** 4
        //  ***** 5

        for (int satir = 1; satir <= 5; satir++) {

            for (int i = 1; i <= 5; i++) {
                System.out.print("*"); // 25 kez çalışıyor
            }

            System.out.println();

        }


    }
}
