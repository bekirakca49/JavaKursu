package Gun05;

import java.util.Scanner;

public class _12_07_Odev {
    public static void main(String[] args) {
        // Bir boolenan oluşturunuz. konsola "Bir Banka Hesabınız Var mı?" yazınız.
        // Varsa True, yoksa False olarak konsoldan cevap veriniz. Boolena ı yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir Banka Hesabınız Var mı?= ");
        boolean bankaHesabinizVarMi=oku.nextBoolean();

        System.out.println("Banka hesabınız var mı?= "+bankaHesabinizVarMi);

    }
}
