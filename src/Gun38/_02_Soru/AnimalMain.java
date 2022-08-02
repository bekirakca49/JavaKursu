package Gun38._02_Soru;

import java.util.ArrayList;

public class AnimalMain {
    public static void main(String[] args) {
        Cat c1=new Cat("Tekir");
        Duck d1=new Duck("Uzun Gaga");
        Shark sh1=new Shark("Suyun Şahı");
        Swallow sw1=new Swallow("Dişli");

        ArrayList<Animal> a=new ArrayList<>();
        a.add(c1);
        a.add(d1);
        a.add(sh1);
        a.add(sw1);


        for (Animal b: a){
            System.out.println('\n'+b.getClass().getSimpleName());
            System.out.println(" --------------------- ");

            System.out.println("Adı : " + b.getAdi());

            if (b instanceof Cat){
            System.out.println("Besini:  " +((Cat) b).food());
            }
            if (b instanceof Duck){
                System.out.println("Besini:  " + ((Duck) b).food());
                System.out.println("Uçuş kabiliyeti : " +((Duck)b).ucus() );
                System.out.println("Ticari satışı: " +((Duck)b).satisi() );
            }
            if (b instanceof Shark){
                System.out.println("Besini:  " + ((Shark) b).food());
                System.out.println("Ticari satışı:" +((Shark)b).satisi() );
            }
            if (b instanceof Swallow){
                System.out.println("Besini:  " + ((Swallow) b).food());
                System.out.println("Uçuş kabiliyeti : " +((Swallow)b).ucus());
            }
        }
    }
}
