package Gun24;

import java.util.ArrayList;

public class _07_03_Odev {
    public static void main(String[] args) {
        //3- getLength() isminde bir method oluşturun. Parametre olarak String ArrayList
        //Return tipi Integer ArrayList
        //ArrayList içindeki her bir Stringin uzunluğunu bulunuz.
        //Tüm elementlerin uzunluğunu döndürün
        //Örneğin;
        //ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
        //Tüm Stringlerin uzunluklarını yazdırın;
        // cevap: 10 ,  8 , 4 , 7 , 6 olmalı

        ArrayList<String> a=new ArrayList<>();
        a.add("New jersey");
        a.add("New york");
        a.add("Ohio");
        a.add("Florida");
        a.add("Boston");


        ArrayList<Integer> b=new ArrayList<>();
        String kelime="";

        for (int i = 0; i <a.size() ; i++) {
            kelime=a.get(i);
            b.add(kelime.length());
        }
        ArrayList k=getLength(a,b,kelime);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    public static ArrayList<Integer> getLength(ArrayList<String> a, ArrayList<Integer> b, String kelime){
        for (int i = 0; i <a.size() ; i++) {
            kelime=a.get(i);
        }
        b.add(kelime.length());
        return b;
        }
}
