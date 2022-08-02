package Gun30.DigerErisimler.Bir;

public class Kitap {
    String name; // default
    Kitap(){ // bu tanım default olmuş oluyor.  
        // Constructor-- yapıcı metod
    }
    public Kitap (String name){
        // istersen kontroller yapabilirsin
        this.name=name;
    }
}
