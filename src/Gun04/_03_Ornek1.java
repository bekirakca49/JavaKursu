package Gun04;

public class _03_Ornek1 {
    public static void main(String[] args) {
        // 3 farklı (char, int, boolen) tip de değişken tanımlayınız. Değer atayınız ve ekrana yazdırınız.
        char a='B';
        int b=8;
        String d="C";
        boolean c=true;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println(b+"-"+a);   // toplamada içlerinde bir tane string ifade varsa toplama işlemi yan yana
                                    // birleştirme işlemene dönüşür. Bu durumda çift tırnak ile ayrı olmalı.
        System.out.println(b+d);
    }
}
