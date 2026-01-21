package activities.Ten;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Object> hs = new HashSet<>();
        hs.add("surya");
        hs.add("abhi");
        hs.add("zhenkar");
        hs.add("akash");
        hs.add(false);
        for (Object obj: hs){
            System.out.println(obj);
        }
        System.out.println("The size of hash set is "+hs.size());
        hs.remove("me");
        System.out.println("After removing the element which is not in hs : " + hs.size());
        System.out.println(hs.contains(true));
        hs.remove("akash");
        System.out.println(hs.contains(false));


    }
}
