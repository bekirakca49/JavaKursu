package Gun38._02_Soru;

public class Shark extends Animal implements ISailing,IAnimal {
    public Shark(String adi) {
        super(adi);
    }
    public String food() {

        return "Shark ..... ile beslenir";
    }

    @Override
    public String satisi() {
        return "Shark'ın satışı yapılmamaktadır";
    }
}
