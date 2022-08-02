package Gun31.StaticModifier.Ornek2;

public class School {
    public static void main(String[] args) {
        // Student (id, name, surName)
        // Yukarıdaki gibi 5 adet öğrenci tanımlayınız.
        // Her öğrencinin takip eden bir numarası olmalı.
        // Ve en son kaç öğrenci olduğunu bulailmeliyim.
        Student ogr1=new Student("Ali","Yılmaz");
        Student ogr2=new Student("Ayşe","Yılmaz");
        Student ogr3=new Student("Hilal","Yılmaz");
        Student ogr4=new Student("Hilal","Yılmaz");
        Student ogr5=new Student("Hilal","Yılmaz");

        System.out.println("ogr1 = " + ogr1);
        System.out.println("ogr2 = " + ogr2);
        System.out.println("ogr3 = " + ogr3);
        System.out.println("ogr4 = " + ogr4);
        System.out.println("ogr5 = " + ogr5);
        System.out.println("Öğrenci Sayısı = " + Student.sayac);
    }
    // TODO: Kullanıcıya bir menu ile öğrenci ekleme, silme, arama
    // TODO: düzeltme imkanı veriniz. Öğrenci silince bile en son
    // TODO: öğrenci sayısı doğru gözükmeli.
}
