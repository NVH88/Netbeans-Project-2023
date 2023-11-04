package javacodeptit;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<SinhVien> arr = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            sc.nextLine();
            arr.add(new SinhVien(sc.nextLine(), sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(arr);
        for (SinhVien x : arr) {
            System.out.println(x);
        }
    }
}