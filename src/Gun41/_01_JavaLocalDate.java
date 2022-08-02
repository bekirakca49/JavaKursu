package Gun41;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

import static java.time.format.FormatStyle.*;
import static java.time.format.FormatStyle.MEDIUM;

public class _01_JavaLocalDate {
    public static void main(String[] args) {
        // LocalDate sadece gün ay yıl bilgisi tutar.
        LocalDate tarih=LocalDate.now();
        System.out.println("tarih = " + tarih);
        System.out.println("tarih.getYear() = " + tarih.getYear());
        System.out.println("tarih.getMonth() = " + tarih.getMonth());
        System.out.println("tarih.getMonthValue() = " + tarih.getMonthValue());
        System.out.println("tarih.getDayOfYear() = " + tarih.getDayOfYear());
        System.out.println("tarih.getDayOfWeek() = " + tarih.getDayOfWeek());
        System.out.println("tarih.getDayOfWeek().getValue() = " + tarih.getDayOfWeek().getValue());

        System.out.println("SHORT = "+tarih.format(DateTimeFormatter.ofLocalizedDate(SHORT)));
        System.out.println("MEDIUM = "+tarih.format(DateTimeFormatter.ofLocalizedDate(MEDIUM)));
        System.out.println("LONG = "+tarih.format(DateTimeFormatter.ofLocalizedDate(LONG)));
        System.out.println("FULL = "+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        System.out.println("FULL locale.GERMANY = "+tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMAN)));
        Locale[] kullanilabilirLokaller=Locale.getAvailableLocales();
        for (Locale l: kullanilabilirLokaller){
            if(l.getDisplayCountry().toLowerCase().contains("new"))
            System.out.println("l+\" \"+l.getDisplayLanguage() = " + l+" "+l.getDisplayLanguage());
        }
       
       // lokaldeki tarih bilgisi alındı ve İZLANDA dacaya göre gösterim.
        Locale localeIzlanda=new Locale("is","IS");
        System.out.println("tarih.format(DateTimeFormatter.ofLocalizedDateTime()) = " +
                tarih.format(DateTimeFormatter.ofLocalizedDate(FULL).withLocale(localeIzlanda)));
       
       
       // İstediğim formatta gösterim. 
        System.out.println("tarih = " + tarih);

        DateTimeFormatter ozelFormat1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("tarih dd/MM/yyyy= " +tarih.format(ozelFormat1));

        DateTimeFormatter ozelFormat2=DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println("tarih dd.MM.yyyy= " +tarih.format(ozelFormat2));

        DateTimeFormatter ozelFormat3=DateTimeFormatter.ofPattern("EEE dd.MM.yyyy");
        System.out.println("tarih dd.MM.yyyy= " +tarih.format(ozelFormat3));
        
        // kendimiz bir tarihi nasıl set edebiliriz, oluşturabiliriz
        LocalDate tarih1=LocalDate.of(2020,6,1);
        LocalDate tarih2=LocalDate.of(2022, Month.DECEMBER,6);

        System.out.println("tarih2.format(ozelFormat2) = " + tarih2.format(ozelFormat2));
        System.out.println("tarih2 = " + tarih2); // burda java defaultu olarak yazdırdı

        LocalDate tarih3=LocalDate.of(2022,10,2);


    }
}
