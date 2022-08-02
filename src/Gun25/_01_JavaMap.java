package Gun25;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class _01_JavaMap {
    public static void main(String[] args) {
        // Sets ->HashSet,linkedHashSet,TreeSet
        // Maps - HashMap, LickedHashMap, TreeMap
        HashSet<Integer> s=new HashSet<>();
        //Map ailesinden Hashmap
        HashMap<Integer,Integer> m=new HashMap<>(); // Key ı ve Value si INTEGER olan bir MAP
        m.put(2,11); // 2 key ine 11 atandı.
        m.put(3,12);
        m.put(6,15);
        m.put(2,5); // 2 anahtarındaki değeri güncelledi.
        System.out.println("m = " + m); // m={2=5, 3012, 6=15} key value
        System.out.println("m.get(2) = " + m.get(2)); // 2 anahtarındaki değer //5
        System.out.println("m.keySet() = " + m.keySet());
        System.out.println("m.values() = " + m.values());

        for (int k:m.keySet())
            System.out.println("k = " + k);
        for (int v:m.values())
            System.out.println("v = " + v);
        for(Map.Entry<Integer,Integer>  anahtarValue:m.entrySet()){
            System.out.println("anahtarValue.getKey() = " + anahtarValue.getKey());
            System.out.println("anahtarValue.getValue() = " + anahtarValue.getValue());
        }
        System.out.println("m.containsKey(2) = " + m.containsKey(2)); //true
        System.out.println("m.containsValue(12) = " + m.containsValue(12)); // true

        m.remove(2); // 2 anahtarındaki değeri sil.   anahtar ve değeri beraber siler
        System.out.println("m = " + m);

        System.out.println("m.keySet().size() = " + m.keySet().size());
        m.clear();
        System.out.println("m = " + m);

    }
}
