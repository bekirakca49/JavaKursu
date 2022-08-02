package Gun39._03_Ornek;

public class YemekDunyasi {
    public static void main(String[] args) {

        Baklava b=new Baklava();
        System.out.println(b.getClass().getSimpleName());
        System.out.println("---------------------------" );
        b.madeln();
        b.taste();

        GreekSalad gs=new GreekSalad();
        System.out.println(gs.getClass().getSimpleName());
        System.out.println("---------------------------" );
        gs.madeln();
        gs.taste();
    }
}
