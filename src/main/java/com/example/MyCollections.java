package com.example;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;

public class MyCollections {
    /// Array
    String[] str = new String[20];
    int[] ints = new int[10];

    //// LIST
    /// ArrayList, LinkedList


    //// SET
    // 1) HashSet= not get assuring for ordering,2) LinkedHasSet = Gave in ordering, 3) TreeSet = sort

    public static void main(String[] args) {
        // create list with values
        List<String> x = Arrays.asList("k", "kk","kk", "hashjhs", "skajslja");

        List<String> myList = new ArrayList<>();

        String myNumber ="20";
        int d = Integer.parseInt(myNumber);

        String strInt = d +"";

        List<Integer> xss = new ArrayList<>();
        xss.add(23);
        int xxx = xss.get(0);
        myList.addAll(x);
        myList.get(3);
        //xss.add


        myList.add("Bhavik");
        myList.add("Kirtesh");

        myList.size();
        myList.clear();
        myList.contains("Bhavik");
        myList.indexOf("Kirtesh");

        /*for (String str : myList) {
            System.out.println(str);
        }

         */


        List<HashSet<String>> extList = new ArrayList<>();


        Set<String> mySet = new TreeSet<>();
        mySet.add("kkk");
        mySet.add("king");
        mySet.add("jack");



        for (String s : mySet) {
            System.out.println(s);
        }


        Map<String,String> myMap = new TreeMap<>();
        // map
        // HashMap, LinkedHashMap, TreeMap
        myMap.put("name","Bhavik");
        myMap.put("sname","Patel");
        myMap.put("friend","Bhavik");

        Set<String> keys = myMap.keySet();

        for (String key : keys) {
            System.out.println(key + ":" +myMap.get(key));
        }


    }






}
