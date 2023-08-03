package Gun47;

import java.util.ArrayList;
import java.util.List;

public class S48 {

    public static void main(String[] args) {
        List colors= new ArrayList();

        colors.add("green");  //0
        colors.add("blue");   //1
        colors.add("red");  // siliniyor
        colors.add("yellow"); //2

        colors.remove(2); // red silindi

        colors.add(3,"chan"); // sıradaki indexe ekleyebiliyor,
        // colors.add("chan"); bunula aynı

        //colors.add(4,"chan"); arada boşluk braktığı için hata verir

        System.out.println("colors = " + colors);
    }

}
