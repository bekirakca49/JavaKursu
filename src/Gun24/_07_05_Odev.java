package Gun24;

import java.util.ArrayList;
import java.util.Collections;

public class _07_05_Odev {
    public static void main(String[] args) {
        //5- rotateList() isminde bir method oluşturun. Parametre olarak String ArrayList
        //ArrayList'in dizilişini terse döndürün. (Tersten yazdırın)
        //Tersten yazılmış halini return edin.
        //Arraylist =  "New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"
        //cevap: "Ohio" , "Florida" ,"Atlanta","New york" ,"New jersey"

        ArrayList<String> a=new ArrayList<>();

        a.add("New jersey");
        a.add("New york");
        a.add("Atlanta");
        a.add("Florida");
        a.add("Ohio");

        System.out.println("a = " + a);

        ArrayList<String> sonuc2=changelnArraylist(a);

        System.out.println("a işlem sonrası = " + a);
    }
    public static ArrayList<String> changelnArraylist(ArrayList<String> b){
        Collections.reverse(b);
        return b;
    }

}
