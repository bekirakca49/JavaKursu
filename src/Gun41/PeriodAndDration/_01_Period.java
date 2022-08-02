package Gun41.PeriodAndDration;

import java.time.LocalDate;
import java.time.Period;

public class _01_Period {
    // 2 tarih arasındaki farkı gösterir
    // LocalDate lar için kullanılır
    public static void main(String[] args) {
        LocalDate dogumTarihi=LocalDate.of(1974,10,18);
        LocalDate buGun=LocalDate.now();

        Period fark=Period.between(dogumTarihi,buGun);
        System.out.println("fark = " + fark);
        System.out.println("fark.getYears() = " + fark.getYears());
        System.out.println("fark.getMonths() = " + fark.getMonths());
        System.out.println("fark.getDays() = " + fark.getDays());
        System.out.println("Fark = "+fark.getYears()+" Yıl "+fark.getMonths()+" Ay "+fark.getDays()+" Gün");

        //*************************************/
        Period period3Gun=Period.ofDays(3);
        Period period3Ay=Period.ofMonths(3);

        LocalDate ucGunSonra=buGun.plusDays(3);
        LocalDate ucAySonra=buGun.plusMonths(3);

        // örnek kursun süresi
        System.out.println("ucGunSonra = " + ucGunSonra);
        System.out.println("ucAySonra = " + ucAySonra);
        
        LocalDate kursunBaslangici=LocalDate.of(2022,4,18);
        Period kursSuresi=Period.ofMonths(6);
        LocalDate kursBitis=kursunBaslangici.plus(kursSuresi);

        System.out.println("kursBitisi = " + kursBitis);
        System.out.println("kursBitisi = " + kursBitis.getDayOfWeek());
        
        Period kacGunKaldi=Period.between(buGun,kursBitis);
        System.out.println("kacGunKaldi = " + kacGunKaldi);
    }
}
