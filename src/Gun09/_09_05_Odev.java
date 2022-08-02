package Gun09;

import java.util.Scanner;

public class _09_05_Odev {
    public static void main(String[] args) {
        //Oluşturulmuş olan int ler hakkında, (num1, num2 , num3, num4),
        // Bu int'leri birbiriyle çarpın ve **sonuca** eşitleyin. **int sonuc** u yazdırın.
        Scanner oku=new Scanner(System.in);
        System.out.print("ilksayi= ");
        int s1= oku.nextInt();
        System.out.print("ikincisayi= ");
        int s2=oku.nextInt();
        System.out.print("üçüncüsayi= ");
        int s3= oku.nextInt();
        System.out.print("dördüncüsayi= ");
        int s4= oku.nextInt();

        int sonuc=s1*s2*s3*s4;
        System.out.print("sonuc = " + sonuc);

    }
}
