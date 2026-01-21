package activities.Eleven;

import java.util.HashMap;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Answer");
        map.put(2,"Question");
        map.put(3,"Apple");
        map.put(4,"Mango");
        System.out.println(map);
        System.out.println(map.get(2));
    }
}
