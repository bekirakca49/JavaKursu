package Gun36.Polyformphism;

public class CiftlikMain {
    public static void main(String[] args) {
        Kopek kopek1=new Kopek("Karabaş");
        Kedi kedi1=new Kedi("kopuk");
        Hayvan kopek2=new Kopek("rodi");
        Hayvan kedi2=new Kedi("tekir");

        kopek1.ses();// gerçekten köpek
        kopek1.kokladi();// gerçekten köpek

        kopek2.ses();// hayvan gibi görünüyor, ama köpek
        ((Kopek)kopek2).kokladi();
        System.out.println("---------------------- ");

        hayvanSeses(kopek1);
        hayvanSeses(kedi1);
        hayvanSeses(kopek2);
        hayvanKokladi(kopek1);
    }
    public static void hayvanSeses(Hayvan h){
        h.ses();
    }
    public static void hayvanKokladi(Hayvan h){
        h.kokladi();
    }
}
