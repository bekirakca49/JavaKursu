package Gun32._03_Ornek;

import Gun32._02_Ornek.Soru;
import org.w3c.dom.css.CSSImportRule;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Scanner;

public class PizzaSiparisHatti {

    // Bir pizza sipariş hattı yapılmak isteniyor.
    // Kullanıcıya Pizza için 1-Small,2-Medium,3-Large, 4-Goster
    // seçeneklerini bir menü şeklinde vererek, verdiği pizzaları
    // bir ARRAYLIST e atınız.
    // Goster (4) ü seçtiğinde her pizzadan kaçar tane sipariş
    // verdiğini bir metodda yazdırınız.
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        ArrayList<Pizza> siparis=new ArrayList<>();

        int secim=0;
        do {
            menu();
            secim=oku.nextInt();
            switch (secim){
                case 1:Pizza ps=new Pizza(PizzaSize.SMALL,10);
                    siparis.add(ps); break;// small pizza listeye ekle
                case 2:Pizza pm=new Pizza(PizzaSize.MEDIUM,15);
                        siparis.add(pm);break;// medium pizza listeye ekle
                case 3:Pizza pl=new Pizza(PizzaSize.LARGE,20);
                    siparis.add(pl);break;// large pizza listeye ekle
                case 4: siparisYaz(siparis);// listeyi yazdır
            }

        }while (secim<=4);
    }
    public static void menu(){
        System.out.println(" ********** MENU ********** ");
        System.out.println("1-Small");
        System.out.println("2-Medium");
        System.out.println("3-Large");
        System.out.println("4-İşleme Al");
        System.out.println("5-Çıkış");
    }
    public static void siparisYaz(ArrayList<Pizza> siparis){
       int smallCnt=0;
       double smallTopUcret=0;
       int mediumCnt=0;
       double mediumTopUcret=0;
       int largeCnt=0;
       double largeTopUcret=0;
       double toplamUcret=0;
       for(Pizza p: siparis)
       {
           toplamUcret+=p.price;
           if (p.size==PizzaSize.SMALL){ smallCnt++;
           smallTopUcret+=p.price;}
           if (p.size==PizzaSize.MEDIUM){ mediumCnt++;
           mediumTopUcret+=p.price;}
           if (p.size==PizzaSize.LARGE) {largeCnt++;
           largeTopUcret+=p.price;}
       }

        System.out.println("Sipariş Listesi = " + siparis);
       System.out.println("smallCnt = " + smallCnt+" Ücreti: "+smallTopUcret);
        System.out.println("mediumCnt = " + mediumCnt+" Ücreti: "+mediumTopUcret);
        System.out.println("largeCnt = " + largeCnt+" Ücreti: "+largeTopUcret);
        System.out.println("Toplam Ödenecek Tutar = " + (smallTopUcret+mediumTopUcret+largeTopUcret));
        System.out.println("toplamUcret = " + toplamUcret);
    }
}
