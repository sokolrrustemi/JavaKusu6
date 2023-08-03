package Gun47;

class Student {
    String name; // null

    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }
}


public class Test_S103{

    public static void main(String[] args) {
        Student[] students = new Student[3];
        //students[0] karşılığı yani bir değeri hiç yok
        students[1] = new Student("Richard");
        students[2] = new Student("Donald");
        for (Student s : students) {
            System.out.print("" + s.name); //.name
        }

        Student ogr0;
        Student ogr1=new Student("ismet");
        Student ogr2=new Student("Ayşe");
        //System.out.println("ogr0.name = " + ogr0.name);
    }
}
