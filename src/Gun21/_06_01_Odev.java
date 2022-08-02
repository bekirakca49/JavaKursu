package Gun21;

public class _06_01_Odev {
    public static void main(String[] args) {
        //1-//Ismi **randomNum** olan bir method oluşturun.
        //Parametre olarak **int max** almalı.
        //Bu method, 0 ile max arasında random bir değer döndürmelidir.
        //Random numarayı döndürünüz.

        int max1=randomNum(100);
        System.out.println("Random sayı= "+max1);
    }
    public static int randomNum(int max){
        int randomSayi=(int)(Math.random()*(max));
        return randomSayi;
    }
}
