package Gun21;

public class _06_03_Odev {
    public static void main(String[] args) {
        //3-
        //reverseString isminde bir method oluşturun.
        //Bu method bir String'i parametre olarak alsın.
        //Ve bu method, girilen String'i tersten yazsın.
        //Terste yazılmış halini yazdırınız.
        //Örn: String = "Java'yı Seviyorum."
        //Print: .muroyiveS ıy'avaJ

        String tersiKelime=reverseString("Ben Java'yı seviyorum");
        System.out.println(tersiKelime);
    }
    public static String reverseString (String cumle){
        String tersiKelime="";

        for (int i=cumle.length()-1;i>=0;i--){
           tersiKelime+=cumle.charAt(i);
        }
        return tersiKelime;
    }
}
