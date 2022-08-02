package Gun41;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class _04_ZoneDateTime {
    public static void main(String[] args) {
        // Başka Zaman bölgelerinin saat dilimlerini alma
        ZonedDateTime zdtLokal=ZonedDateTime.now();
        // şu andaki bölgenin zaman verdi  yani lokal zamanı
        System.out.println("zbt = " + zdtLokal);

       //   ZonedDateTime ztdIstanbul=ZonedDateTime.now(ZoneId);
        // kullanılabilir zonelerin alımı
        Set <String> zamanBolgeleri=ZoneId.getAvailableZoneIds();
        for(String z: zamanBolgeleri){
            if (z.toLowerCase().contains("shi"))
                System.out.println("z = " + z);
        }
        // Europe / Istanbul Asia/Istanbul
        //Şimdi bu Stringden bir zoneID oluşturalım.
        ZoneId zoneIst=ZoneId.of("Europe/Istanbul");
        ZonedDateTime zdtIst=ZonedDateTime.now(zoneIst);
        System.out.println("zdtIst = " + zdtIst);

        ZoneId zoneLon=ZoneId.of("Europe/London");
        ZonedDateTime zdtLon=ZonedDateTime.now(zoneLon);
        DateTimeFormatter gosterimSablonu=DateTimeFormatter.ofPattern("EEEE dd.MM.yyyy HH:mm");
        System.out.println("zdtLon.format(gosterimSablonu) = " + zdtLon.format(gosterimSablonu));

    }
}
