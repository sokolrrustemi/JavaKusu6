package Gun43;

public class _03_JavaException {
    public static void main(String[] args) {

        System.out.println("Program çalışmaya başladı");
        String kelime="";
        char harf=kelime.charAt(3); // 3.karakter yok


        System.out.println("Program bitti");

        // Derleme zamanı hataları: program çalışamadı : COMPILE ERROR, Exception
        // Program çalışmaya başladıktan sonra oluşan hatalar : RUNTIME ERROR, Exception
    }
}
