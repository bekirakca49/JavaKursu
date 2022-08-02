package Gun14;

import java.util.Scanner;

public class _01_Switch {
    public static void main(String[] args) {
        // girilen bir ay numarasına göre, ayın kaç gün olduğunu sayı ile yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.println("Ayıdın kodunu giriniz= ");
        int ayNo=oku.nextInt();

        switch (ayNo){
            case 1:
            case 3:
            case 5:
            case 8: System.out.println("Ağustos ayı 31 gündür");break;
            case 2: System.out.println("Şubat ayı 28 gündür");break;
            case 4:
            case 6:
            case 7:
            case 9:
            case 10:  // 10. ay istenince 10'a gelip çıkamadığı için sonucu 11.ay olarak gösterir
            case 11:
            case 12: System.out.println("Aralık ayı 30 gündür");break;
            default:System.out.println("hatalı ay no");break;}
        // gruplama yapılabiliyor. 31 çeken aylar üste, 30 çeken aylar aşağıya yazılabiliyor. böylece bilgisayar daha az çalışmış oluyor.
    }
}
