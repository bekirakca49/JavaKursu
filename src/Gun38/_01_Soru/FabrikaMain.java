package Gun38._01_Soru;

import java.util.ArrayList;

public class FabrikaMain {
    public static void main(String[] args) {

        TeslaCar tesla=new TeslaCar("model5",310);
        Bus bus=new Bus("IVECO",400);
        ToyotaPirus tp=new ToyotaPirus("pirus",200);

        ArrayList<Vehicle> arabalar=new ArrayList<>();
        arabalar.add(tesla);
        arabalar.add(bus);
        arabalar.add(tp);

        for(Vehicle v:arabalar){
            System.out.println('\n' +v.getClass().getSimpleName());
            System.out.println("______________________________");

            System.out.println("Model = " + v.getModel());
            System.out.println("Engine = " + v.getEngine());
            if(v instanceof TeslaCar){
                System.out.println(((TeslaCar)v).drive());
                System.out.println(((TeslaCar)v).changeBattery());
            }
            if(v instanceof ToyotaPirus){
                System.out.println(((ToyotaPirus)v).drive());
                System.out.println(((ToyotaPirus)v).changeBattery());
                System.out.println(((ToyotaPirus)v).changeOil());
        }
            if(v instanceof Bus) {
                System.out.println(((Bus) v).drive());
                System.out.println(((Bus) v).changeDiesel());
            }
        }
    }
}
