package Gun41;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _02_JavaLokalTime {
    public static void main(String[] args) throws InterruptedException {
        // tarih içermez sadece saat, dak, san, nano san içerir
        LocalTime saat=LocalTime.now();
        System.out.println("saat = " + saat);

        System.out.println("saat.getHour() = " + saat.getHour());
        System.out.println("saat.getMinute() = " + saat.getMinute());
        System.out.println("saat.getSecond() = " + saat.getSecond());
        System.out.println("saat.getNano() = " + saat.getNano());
        
        // kendimize özelformat oluştrma.

        DateTimeFormatter ozelFormat1=DateTimeFormatter.ofPattern("hh:mm");
        System.out.println("saat.format(ozelFormat1) = " + saat.format(ozelFormat1));

        DateTimeFormatter ozelFormat2=DateTimeFormatter.ofPattern("hh:mm:ss");

        DateTimeFormatter ozelFormat3=DateTimeFormatter.ofPattern("hh:mm:ss a");
        System.out.println("saat.format(ozelFormat3) = " + saat.format(ozelFormat3));

        // Canlı saat
        while (true){
            saat=LocalTime.now();
            System.out.print("\rsaat = " + saat.format(ozelFormat2));
            Thread.sleep(1000); // 1 sn bekleyecek.
        }
        // ********************* //
    }
}
