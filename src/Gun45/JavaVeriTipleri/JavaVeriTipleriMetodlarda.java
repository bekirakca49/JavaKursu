package Gun45.JavaVeriTipleri;

import java.util.Arrays;

public class JavaVeriTipleriMetodlarda {
    int a1;
    static int a2;
    static void metod1(){}

    public static void main(String[] args) {
        JavaVeriTipleriMetodlarda j=new JavaVeriTipleriMetodlarda();
        j.a1=7;
        a2=8;
        metod1();

        int a=5;
        doProduct(a);
        System.out.println("a = " + a); // anın değeri değişirmi, burda a'nın değeri değişmez.

        int[] dizi1={1,2,3};
        doProduct2(dizi1);
        System.out.println("Arrays.toString(dizi1) = " + Arrays.toString(dizi1));
        // a) 123     b) 65 2 3;
        // sadece değerleri mi gidiyor
        // yoksa adresi mi gidiyor, yani kendisi mi gidiyor.
        // evet adres gidiyor. doğal olarak return olmadan değişim sağlanmış oluyor. referans tiplerde
    }
    public static void doProduct(int a){
        a=5*a;//
    }
    public static void doProduct2(int[] dizi2){
        dizi2[0]=65;
    }
    String isim3="İsmet";
    // a) 123     b) 65 2 3;
    // sadece değerleri mi gidiyor
    // yoksa adresi mi gidiyor, yani kendisi mi gidiyor.
    // evet adres gidiyor. doğal olarak return olmadan değişim sağlanmış oluyor. referans tiplerde

    public static void doProduct4(String isim3){
        isim3="mahmut";
    }

}
