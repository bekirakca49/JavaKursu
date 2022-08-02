package Gun41.PeriodAndDration;

import javax.swing.*;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _02_Duration {
    //time ve Localdatetime lar iin kullanılır
    // bunların arasındaki farkları gösterir
    public static void main(String[] args) {
        LocalTime geceYarisi=LocalTime.of(0,0);
        LocalTime ogleVakti=LocalTime.of(13,3,2);

        Duration fark=Duration.between(geceYarisi,ogleVakti);
        System.out.println("fark = " + fark);
        System.out.println("fark saat = " + fark.toHoursPart());
        System.out.println("fark.toMinutesPart() = " + fark.toMinutesPart());
        System.out.println("fark.toSeconds() = " + fark.toSecondsPart());

        System.out.println("--------------------------------");
        System.out.println("fark.toHours() = " + fark.toHours());// tolam dakika hali
        System.out.println("fark dakika = " + fark.toMinutes()); // toplam dakika hali
        System.out.println("fark.toSeconds() = " + fark.toSeconds());

        // LocalDateTamie ***** 2 zaman farkı *****

        LocalDateTime from=LocalDateTime.of(2020,10,4,10,20,55);
        LocalDateTime to=LocalDateTime.of(2020,11,15,11,21,56);

        Duration farkZaman=Duration.between(from,to);
        System.out.println("farkZaman = " + farkZaman);
        System.out.println("--------------------------------");
        System.out.println("farkZaman.toDaysPart() = " + farkZaman.toDaysPart());
        System.out.println("farkZaman.toHourPart = " + farkZaman.toHoursPart());
        System.out.println("farkZaman.toMinutesPart = " + farkZaman.toMinutesPart());
        System.out.println("farkZaman.toSecondsPart = " + farkZaman.toSecondsPart());
        System.out.println("--------------------------------");
        System.out.println("farkZaman.toDays = " + farkZaman.toDays());
        System.out.println("farkZaman.toHours = " + farkZaman.toHours());
        System.out.println("farkZaman.toMinutes = " + farkZaman.toMinutes());
        System.out.println("farkZaman.toSeconds = " + farkZaman.toSeconds());


    }
}
