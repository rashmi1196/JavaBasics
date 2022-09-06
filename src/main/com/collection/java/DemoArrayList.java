package com.collection.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoArrayList {



    public static void main(String[] args) {
        List al = new ArrayList<String>();
        al.add("Demo");
        al.add("Java");
        al.add("Collection");

        System.out.println(al);

        System.out.println("Index of demo, after adding it again");
        al.add("Demo");
        al.add("java");
        System.out.println(al);
        System.out.println(al.lastIndexOf("Demo"));


        System.out.println("Add Array at third index");
        al.add(3,"Array");
        System.out.println("===================list after adding value at index 3===============");
        Iterator itr1 = al.iterator();
        while(itr1.hasNext()){
            System.out.printf(itr1.next()+" ");
        }

        System.out.println("\n============Cloning array list==============");
        List arrayListClone =  (ArrayList<String>) ((ArrayList<?>) al).clone();
        System.out.println(arrayListClone);

        System.out.println("===========================Trimming the size====================");
        ((ArrayList<?>) al).trimToSize();
        System.out.println(al);

        System.out.println("==============Converting to Array====================");
        System.out.println(al.toArray());



        System.out.println("clear arraylist");
        al.clear();
        System.out.println(al);


    }
}
