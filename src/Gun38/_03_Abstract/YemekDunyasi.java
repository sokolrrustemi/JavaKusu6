package Gun38._03_Abstract;

public class YemekDunyasi {
    public static void main(String[] args) {
        Baklava b=new Baklava();
        System.out.println(b.getClass().getSimpleName());
        b.madeIn();
        b.taste();
        System.out.println();

        CheeseCake c=new CheeseCake();
        System.out.println(c.getClass().getSimpleName());
        c.madeIn();
        c.taste();
        System.out.println();

        GreekSalad g=new GreekSalad();
        System.out.println(g.getClass().getSimpleName());
        g.madeIn();
        g.taste();
        System.out.println();

        SezerSalad s=new SezerSalad();
        System.out.println(s.getClass().getSimpleName());
        s.madeIn();
        s.taste();

    }
}
