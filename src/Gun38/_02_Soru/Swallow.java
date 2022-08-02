package Gun38._02_Soru;
public class Swallow extends Animal implements IAnimal, IFlying{
    public Swallow(String adi) {
        super(adi);
    }
    @Override
    public String food() {
        return null;
    }

    @Override
    public String ucus() {
        return "Swallow'un uçuş kabiliyeti var";
    }
}
