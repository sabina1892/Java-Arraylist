package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Include the general number of arraylists");
        int k = sc.nextInt();
        List<List<Integer>> list = new ArrayList<>(); // we created list of integer list, this is a dynamic list

        for(int i = 0; i < k;i++){ // we add elements of integer list "arr"
            System.out.println("Include every number of arraylist");
            int r = sc.nextInt();
            List<Integer> arr = new ArrayList();
            for(int j = 0; j < r; j++){
                System.out.println("Add element of list");
                arr.add(sc.nextInt());
            }
            list.add(arr); // we add "arr"" list to "list""
        }
        System.out.println("How many times checking list");
        int k2 = sc.nextInt();
        for(int i = 0; i < k2; i++) {
            System.out.println("Which array do you want to check");
            int a = sc.nextInt();
            int len = list.get(a - 1).size(); // we get every size of "arr" list
            if (a <= k) { // we must add condition
                System.out.println("Which element do you want to check");
                int b = sc.nextInt();
                if (b <= len)
                    System.out.println(list.get(a - 1).get(b - 1)); // solve
                else System.out.println("ERROR!");

            }
        }

    }
}