package Gun17;

import java.util.Arrays;

public class _07_01_Odev {
    public static void main(String[] args) {
        //1-   String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        //Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        //Eğer aitse "true" çevirin.
        String[] kelimeler={"Apple","Orange","Banana","Pineapple"};

      for (int i=0;i< kelimeler.length;i++) {
          if (kelimeler[i] == "Apple")
              System.out.println("Apple kelimesi mevcut");
      }
    }
}
