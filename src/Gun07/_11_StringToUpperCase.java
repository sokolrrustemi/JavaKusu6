package Gun07;

public class _11_StringToUpperCase {
    public static void main(String[] args) {
        // ToUpperCase : string büyük harfe çevirir

        String text="Merhaba Dünya";

        System.out.println("orjinal hali = " + text);
        System.out.println("text.toUpperCase() = " + text.toUpperCase());

        boolean bununlaBasliyormu= text.toUpperCase().startsWith("M");
        System.out.println("M veya m ile basliyor mu = " + bununlaBasliyormu);
    }
}
