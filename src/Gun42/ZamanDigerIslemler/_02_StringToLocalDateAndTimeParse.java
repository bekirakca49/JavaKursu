package Gun42.ZamanDigerIslemler;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class _02_StringToLocalDateAndTimeParse {
    public static void main(String[] args) {

        String strDate="25 01 2020"; // bu giriş 01/25/2020 de olabilir.

        DateTimeFormatter format=DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDate tarih=LocalDate.parse(strDate,format);
        System.out.println("tarih = " + tarih.format(format));

    }
}
