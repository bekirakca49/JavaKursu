package Gun03;

public class _02_JavaDataTypes {
    public static void main(String[] args) {
        int sayi;

        // default olarak tamsayıların hepsini INT kabul eder
        // default olarak ondalıklı sayıların hepsini DOUBLE kabul eder
        byte byteDeger=7;
        short shortDeger=1645;
        int intDeger=25000;
        long longDeger=2333333333333L; // default olarak ondalıklı sayıların hepsini DOUBLE kabul eder
        float floatDeger=3.140019F;  // ondalık sayıları default olarak DOUBLE kabul etiğinden
                                // sonuna F(float) eklendi, sayıya hiç bir etkisi yoktur
        double doubleDeger=3.14000000000000000; // her iki tarafta double olduğundan ek bilgiye ihtiyaç olmadı.

        char basHarf='A';
        char basHarf2=65;    // karakter tablosunda 65 A ya karşılık geldiği için sayısını da atayabiliriz.
        boolean evetMi=true;
        boolean hayirMi=false;

        System.out.println("evetMi = " + evetMi);
        System.out.println("hayirMi = " + hayirMi);
        System.out.println("basHarf2 = " + basHarf2);
        System.out.println("floatDeger = " + floatDeger);
        System.out.println("longDeger = " + longDeger);
        System.out.println("intDeger = " + intDeger);
        System.out.println("byteDeger = " + byteDeger);
        System.out.println("doubleDeger = " + doubleDeger);
        System.out.println("basHarf = " + basHarf);
    }
}
