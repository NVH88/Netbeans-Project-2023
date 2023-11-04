package test;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        HashSet<Integer> se1 = new HashSet<>();
        HashSet<Integer> se2 = new HashSet<>();
        for (int i = 0; i < 10; ++i)
            se1.add(i);
        for (int i = 5; i < 15; ++i) 
            se2.add(i);
//        se1.removeAll(se2);
//        for (int i : se1) {
//            System.out.println(i);
//        }
        System.out.println(Collections.max(se2));
    }      
}