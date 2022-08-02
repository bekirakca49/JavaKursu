package Gun20;

import java.rmi.StubNotFoundException;

public class _03_JavaMethod {
    public static void main(String[] args) {
        merhabaYaz();
        ozelmerhabaYaz("Ismet");
        ozelmerhabaYaz("Mehmet");
        ozelmerhabaYaz("Melike");
    }
    public static void merhabaYaz(){
        System.out.println("Merhaba");
        System.out.println("Merhaba2");
    }
    public static void ozelmerhabaYaz(String isim){
        System.out.println(isim+" Merhaba");
}
}
