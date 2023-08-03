package Gun31._01_Enum;

//enum Aylar {
//    Tanimsiz, OCAK, SUBAT, MART, NISAN, MAYIS, HAZIRAN,
//    TEMMUZ, AGUSTOS, EYLUL, EKIM, KASIM, ARALIK
//}

public class Ornek1Cozum {

    // class ın içinde de enum tanımlanabilir, ancak METOD ların içind etanımlanamaz.

    // enumaration : numaralandırılmış simgeler
    public static void main(String[] args) {
        int  sayi=5;
        Aylar ay=Aylar.MAYIS;

        switch (ay){
            case SUBAT: System.out.println(28); break;
            case OCAK:
            case MART:
            case MAYIS:
            case TEMMUZ:
            case AGUSTOS:
            case EKIM:
            case ARALIK:System.out.println(31); break;
            case NISAN:
            case HAZIRAN:
            case KASIM:
            case EYLUL: System.out.println(30); break;
        }

        if (ay == Aylar.MAYIS)
            System.out.println("Zam ayı");

        System.out.println("ay = " + ay); // toString SIMGE  MAYIS
        System.out.println("ay.name() = " + ay.name()); // SIMGE MAYIS
        System.out.println("ay.ordinal() = " + ay.ordinal()); //SIMGE NIN indexi 5

        for(Aylar a : Aylar.values())
            System.out.println(a.name()+" - " + a.ordinal());

    }

}
// Yazılım dillerinde enum, enumaration ve enum sabitleri
// olarak adladırılmaktadır. Tanımlanan değişkenlerin
// sabit değer alması için kullanılır. Tanımlanan
// bu sabit değerler bir grup oluşturur. Erişilmesi,
// yönetilmesi ve anlaşılması kolay hale gelir.

