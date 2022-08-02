package Gun29._02_Constructor;

public class Kitap {
    //// Book class yazınız. fields: name, publishYear, author.
    String name;
    int publichYear;
    String author;
        // yapıcı metod: Constructor metod
    public Kitap(){ // 1. Constructor
    }
    //2. Constructor
    public Kitap(String name, int publichYear, String author){
        this.name=name;
        this.publichYear=publichYear;
        this.author=author;
    }
    public Kitap(String name, int publichYear){
        this.name=name;
        this.publichYear=publichYear;
        this.author="";
    }
    public void Yazdir(){
        System.out.println(name+" "+publichYear+" "+author);
    }
    public String toString(){
        return name+" "+publichYear+" "+author;
    }
}
