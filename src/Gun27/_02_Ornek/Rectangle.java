package Gun27._02_Ornek;

public class Rectangle {
    //width, length
    int length;
    int with;
    public void Cevre()
    {
        System.out.println("Cevresi = " + (length+with)*2);
    }
    public void Alan()
    {
        System.out.println("Alanı = " +(length*with));
    }
    public int Alan2()
    {
       return (length*with);
    }
}
