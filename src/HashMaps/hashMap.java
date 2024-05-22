package HashMaps;

import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(10,20);
        hm.put(20,30);
        hm.put(30,50);

        System.out.println(hm.get(30));//50
        System.out.println(hm.get(40));//null

        System.out.println(hm.containsKey(20));//true
        System.out.println(hm.containsKey(50));//false

        hm.remove(20);
        System.out.println(hm.containsKey(20));//false


        //print key
        for (int key: hm.keySet()) {
            System.out.println(key);
        }
        //print value
        for (int value: hm.values()) {
            System.out.println(value);
        }


    }
}
