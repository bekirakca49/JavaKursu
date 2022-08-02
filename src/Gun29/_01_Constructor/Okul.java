package Gun29._01_Constructor;

public class Okul {
    public static void main(String[] args) {

        //1. Yöntem
        Student ogr1=new Student();
        ogr1.id=1;
        ogr1.name="Ali Kemal";
        ogr1.surName="İnal";
        ogr1.classroom=11;
        System.out.println("ogr1.name = " + ogr1.name);

        //1. Yöntem
        Student ogr2=new Student();
        ogr2.id=2;
        ogr2.name="Kemal";
        ogr2.surName="İnal";
        ogr2.classroom=12;
        System.out.println("ogr1.name = " + ogr2.name);

        //1. Yöntem
        Student ogr3=new Student();
        ogr3.id=3;
        ogr3.name="Hasan";
        ogr3.surName="Kaplan";
        ogr3.classroom=12;
        System.out.println("ogr1.name = " + ogr3.name);

        // 2. Yöntem

    }
}
