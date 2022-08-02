package Gun21;

public class _06_02_Odev {
    public static void main(String[] args) {
        //2-
        //"OrtaKelime" isminden bir method oluşturun.
        //Bu method String'i parametre olarak almalı.
        //Cümle veya dizelerde ortada bulunan kelimeleri bulmalı.
        //Ortadaki kelimeyi return yapınız.
        //Örnek: Ben Java'yı seviyorum.
        //print : Java'yı
        //Örnek2:
        //Java'yı kolayca öğreniyorum.
        //print: kolayca

        String ortaKelime1=ortaKelime("Ben Java'yı seviyorum");
        System.out.println(ortaKelime1);
    }
    public static String ortaKelime (String cumle){
        String ortaKelim="";

        for (int i=0;i<cumle.indexOf(" ");i++){
            ortaKelim=cumle.substring((i+1), cumle.lastIndexOf(" "));
        }

        return ortaKelim;
    }
}
