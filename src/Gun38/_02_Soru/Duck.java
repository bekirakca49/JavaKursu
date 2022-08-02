package Gun38._02_Soru;
public class Duck extends Animal implements ISailing,IFlying,IAnimal {

    public Duck(String adi) {
        super(adi);
    }

    @Override
    public String food() {
        return "Duck balık ile beslenir";
    }
    @Override
    public String ucus() {
        return "Duck'ın uçuş kabiliyeti var";
    }

    @Override
    public String satisi() {
        return "Duck ticareti yapılmaktıdr";
    }
}
