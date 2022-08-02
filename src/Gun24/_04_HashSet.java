package Gun24;

import java.util.HashSet;

public class _04_HashSet {
    public static void main(String[] args) {
        HashSet hs=new HashSet(); //bilgi tutma özelliği eklenmez ise, herşeyi kabul eder.
        hs.add("bes");
        hs.add(5);
        hs.add("ismet");
        hs.add(4.5);
        hs.add(true);
        System.out.println("hs = " + hs);
        for(Object o:hs) // Object: bütün tiplerin atası.
            System.out.println("o = " + o);

        HashSet<Integer> hs2=new HashSet(); //bilgi tutma özelliği eklenmez ise, herşeyi kabul eder.
        hs2.add(1);
        hs2.add(5);
        hs2.add(50);
        hs2.add(4);
        hs2.add(45);
        System.out.println("hs2 = " + hs2);
        System.out.println("hs2 size = " + hs2.size());

        hs2.remove(1);
        System.out.println("remove sonrası hs2 = " + hs2);

        // bu eleman var mı?
        if (hs2.contains(5))
            System.out.println("5 Var ");
        else System.out.println("5 Yok ");

        hs2.clear();
        System.out.println("clear sonrası hs2 = " + hs2);


    }
}
