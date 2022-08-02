package Gun40._01_Ornek;

import java.util.ArrayList;

public class HayvanMain {
    public static void main(String[] args) {
        Kartal kr=new Kartal("Kartal",true,"21.01.2000");
        System.out.println("kr = " + kr);
        Kedi kd=new Kedi("Yırtıcı",false,"1.01.2002");
        System.out.println("kd = " + kd);
    }
}
