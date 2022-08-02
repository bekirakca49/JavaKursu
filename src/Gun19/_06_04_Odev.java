package Gun19;

import java.util.Scanner;

public class _06_04_Odev {
    public static void main(String[] args) {
        //4- Aşağıda verilen gün adlarına göre, Girilen bir gün numarasına karşılık gelen gün adını
        //yazınız.
        //Eger int 1 ise print monday
        //Eger int 2 ise print tuesday
        //Eger int 3 ise print wednesday
        //Eger int 4 ise print thursday
        //Eger int 5 ise print friday
        //Eger int 6 ise print saturday
        //Eger int 7 ise print sunday
        //Eger int 8 den buyuk ise print "this is not a valid day"
        //NOT : BU PROBLEMI ÇÖZERKEN SWITCH STATEMENT KULLANIN
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir günün numarasını giriniz= ");
        int gunNo= oku.nextByte();

        switch (gunNo){
            case 1:System.out.println("Pazartesi_Monday");break;
            case 2:System.out.println("Salı_Tuesday");break;
            case 3:System.out.println("Çarşamba_Wednesday");break;
            case 4:System.out.println("Perşembe_Thursday");break;
            case 5:System.out.println("Cuma_Friday");break;
            case 6:System.out.println("Cumartesi_Saturday");break;
            case 7:System.out.println("Pazar_Sunday");break;
            default:System.out.println("günNo hatalıdır_this is not a valid day");break;
        }
    }
}
