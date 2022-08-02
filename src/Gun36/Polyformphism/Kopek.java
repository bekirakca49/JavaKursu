package Gun36.Polyformphism;

public class Kopek extends Hayvan{
    public Kopek(String name) {
        super(name);
    }

    @Override
    public void ses() {
        System.out.println("Havladı");
    }

    @Override
    public void kokladi() {
        super.kokladi();
    }
}
