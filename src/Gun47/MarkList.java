package Gun47;

// Soru 52
public class MarkList {
    int num;

    public static void graceMarks(MarkList obj4){  // fonksiyondaki adı obj4 ama obj1 ve obj2 dir
        obj4.num+=10;        //fonksiyona nesnenin kendisi gider, aynı dizi gibi
    }

    public static void main(String[] args) {
        MarkList obj1=new MarkList();  // bir tane nesne var obj1.num => 0
        System.out.println("obj1.num = " + obj1.num);
        MarkList obj2=obj1; // obj2.num ->  0
        System.out.println("obj2.num = " + obj2.num);
        MarkList obj3=null;
        MarkList obj4;

        obj2.num=60; // obj2.num -> 60, obj1.num -> 60
        System.out.println("obj2.num = " + obj2.num);
        System.out.println("obj1.num = " + obj1.num);

        graceMarks(obj2); // aynı zamanda obj1
        System.out.println("obj2.num = " + obj2.num); // 70
        System.out.println("obj1.num = " + obj1.num); // 70

    }
    // hafızada kaçtane MarList NESNESİ vardır.
    // Soru : obj2.num un değeri kaç oldu ?

}
