package Gun24;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
public class _07_12_Odev {
    public static void main(String[] args) {
        //12-changeSet() isminde bir method oluşturun.
        //Parametre olarak bir String HashSet   ve  iki String
        //return hashset olmalı
        //Eğer HashSet String 1 e sahipse, String 1 ile String 2 yi değiştirin.
        //**ÖRNEK:**
        //hashset = "banana" , "strawberry" , "kiwi" , "pineapple"
        //String 1 = **banana**
        //String 2 = **peach**
        //**CEVAP:** "peach" , "strawberry" , "kiwi" , "pineapple"
        HashSet<String> aH=new HashSet<>();
        aH.add("banana");
        aH.add("strawberry");
        aH.add("kiwi");
        aH.add("pineapple");

        String  s1="banana";
        String s2="peach";
        //HashSet<String> changeSet=changeSet(aH,s1,s2);
        }/*
     public static HashSet<String> changeSet(HashSet<String> aH,String s1,String s2) {
         HashSet<String> changeSet=new HashSet<>(HashSet.asList(aH));
         changeSet=
        return changeSet;
    }*/
}
