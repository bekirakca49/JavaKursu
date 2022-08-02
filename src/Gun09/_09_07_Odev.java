package Gun09;

public class _09_07_Odev {
    public static void main(String[] args) {
        //7- Verilen int ler hakkında (num1 ve num2),
        //num1'in num2'ye bölümünden kalanı int sonuc'a eşitleyiniz. int sonuc'u yazdırınız.
        int num1=30256;
        int num2=17;


        double sonucDouble=((double)num1/(double)num2);
        int sonucInt=((int)num1/(int)num2);
        int sonuc=num1/num2;

        System.out.println("sonucDouble = " + sonucDouble);
        System.out.println("sonucInt = " + sonucInt);
        System.out.println("sonuc = " + sonuc);

    }
}
