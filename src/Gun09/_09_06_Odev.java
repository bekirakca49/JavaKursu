package Gun09;

public class _09_06_Odev {
    public static void main(String[] args) {
        //Verilen int ler hakkında (num1, num2),
        //num1 'in   num2'ye bölümünden **kalanı, int sonuc'a**  eşitleyin. int sonucu yazdırın.

        int num1=21;
        int num2=4;
        int sonuc=(num1/num2)%10;
        int sayi=21%10;
        System.out.println("sonuc = " + sonuc);
        System.out.println("sayi = " + sayi);
    }
}
