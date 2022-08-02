package Gun36.Final.metod;

public class Araba extends Tasit {
    String renk;

    public Araba(String model) {
        super(model);
    }
    public void arabaYazdir(){
        System.out.println("renk = " + renk+ super.getModel());
    }

   // @Override
   // public String toString() {// miras alınan class taki FİNAL metodlarını değişteremeyiz.
   //     return super.toString();
   // }
}
