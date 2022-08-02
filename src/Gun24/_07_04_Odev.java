package Gun24;

import java.util.ArrayList;

public class _07_04_Odev {
    public static void main(String[] args) {
        //4-İsmi changelnArraylist() olan bir method oluşturun.
        //Parametre olarak String ArrayList, String s1, String s2
        //   Arraylist'te s1'i s2 olarak değiştirin
        // Return String arrayList
        //Örneğin;
        //Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
        //s1 = blue
        //s2 = yellow
        //Tüm blue 'ları yellow'a dönüştürün.
        //cevap: "yellow" , "red" , "yellow" , "red" , "yellow"
        ArrayList<String> a=new ArrayList<>();

        a.add("yellow");
        a.add("red");
        a.add("blue");
        a.add("red");
        a.add("yellow");
        String s1="blue";
        String s2="yellow";
        System.out.println("a = " + a);

        ArrayList<String> sonuc2=changelnArraylist(a,s1,s2);

        System.out.println("a işlem sonrası = " + a);
    }
    public static ArrayList<String> changelnArraylist(ArrayList<String> a, String s1, String s2){
        a.set(a.indexOf(s1),s2);
        return a;
    }
}
