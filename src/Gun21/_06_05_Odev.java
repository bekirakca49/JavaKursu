package Gun21;

import java.util.ArrayList;
import java.util.Collections;

public class _06_05_Odev {
    public static void main(String[] args) {
        //5-getSum isminde bir method oluşturun.
        //Parametresi ArrayList'tir.
        //Dizideki tüm $ ları kaldır ve tüm sayıları topla
        //return yaptğımız veri tipi 'int' olmalıdır.
        //sonuç 0'dan küçükse, -1 yazdırın.
        //Örnek1:
        //ArrayList = $13, $15, $20
        //Cevap = 48 olmalı
        //Örnek 2 :
        //ArrayList= $-13, $0, $0
        //Cevap = -1 olmalı.

        ArrayList<String> diziList=new ArrayList<>();
        diziList.add("$13");
        diziList.add("$15");
        diziList.add("$20");

        System.out.println("diziListesi = " + diziList);

        int toplam=getSum(diziList);
    }
    public static int getSum(ArrayList<String> diziList){
    ArrayList<Integer> yeniDiziList=new ArrayList<>();
    String kelimeAl="";
    int toplam=0;

        for (int i=0;i<diziList.size();i++)
    {
        kelimeAl=diziList.get(i);
        kelimeAl=kelimeAl.replace("$","");
        yeniDiziList.add(Integer.parseInt(kelimeAl));
    }
        for (int i=0;i<yeniDiziList.size();i++) {
            toplam += yeniDiziList.get(i);
        }

        System.out.println("yeniDiziList = " + yeniDiziList);
        System.out.println("toplam = " + toplam);

        return toplam;
    }
}
