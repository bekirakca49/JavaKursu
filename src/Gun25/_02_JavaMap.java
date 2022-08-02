package Gun25;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;
import java.util.HashMap;
import java.util.Map;

public class _02_JavaMap {
    public static void main(String[] args) {
        // Bir kartvizit uygulamasını 2 kişi çin yapınız.
        Map<String,String> nKartvizit=new HashMap<>();
        nKartvizit.put("isim", "Nazmiye");
        nKartvizit.put("email", "nazmiye@gmail.com");
        nKartvizit.put("adres", "Türkiye");
        nKartvizit.put("telefon","34343434343434");

        System.out.println("sKartvizit.get(\"isim\") = " + nKartvizit.get("isim"));
        System.out.println("sKartvizit.get(\"telefon\") = " + nKartvizit.get("telefon"));

        Map<String,String> kKartvizit=new HashMap<>();
        kKartvizit.put("isim", "Kadir");
        kKartvizit.put("email", "kadir@gmail.com");
        kKartvizit.put("adres", "Almanya");
        kKartvizit.put("telefon","66667755777");
        
        Map<String, Map<String, String>> kartDefteri=new HashMap<>();
        kartDefteri.put("nazmiye",nKartvizit); // nazmiye anahtarına Nazmiye nin kartviziti atandı
        kartDefteri.put("kadir",kKartvizit);

        System.out.println("kartDefteri.get(\"kadir\").get(\"telefon\") = " + kartDefteri.get("kadir").get("telefon"));
        for(Map.Entry<String,Map<String,String>> kartVizit:kartDefteri.entrySet())
        {
            System.out.println("kartVizit = " + kartVizit);
        }
    }
}
