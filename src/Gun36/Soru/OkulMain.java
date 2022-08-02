package Gun36.Soru;
public class OkulMain {
    public static void main(String[] args) {
        Calisan cls1=new Calisan("bekir","akça","Çalışan","Test Team");
        Ogrenci ogr1=new Ogrenci("Hasan","Kaplan","Ders çalışmak","6B");
        System.out.println("ogr1 = " + ogr1);
        System.out.println("cls1 = " + cls1);

        ogr1.KimlikBelgesiYaz(cls1);
        ogr1.KimlikBelgesiYaz(ogr1);
    }
}
