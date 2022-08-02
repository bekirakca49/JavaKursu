package Gun28._03_Soru;
import java.util.ArrayList;
public class Student {
    // 2- Öğrenci Class: adı: Student, fields : name, maxCredit, dersleri listesini tutacak bir liste
    String name;
    int maxCredit;
    ArrayList<Lesson> dersleri=new ArrayList<>();

    public void dersEkle(Lesson ders)
    {
        // gelen dersin kredisi artırıp,  var olan krediyi toplayıp kotrol edeceğiz. Öğrencinin maxKredisi aşıyor mu?
        int toplamAlinanKredi=0;
        for(Lesson l: dersleri)
            toplamAlinanKredi+=l.credit;

        System.out.println("toplamAlinanKredi = " + toplamAlinanKredi);

        if (toplamAlinanKredi+ders.credit<=maxCredit) {
            dersleri.add(ders);
            System.out.println("Eklendi= " + ders.name);
        }
        else System.out.println("Alınabilinecek kredi miktarı aşıldı = " + ders.name);
    }
}
