package com.collection.java;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList {


        public static void main(String[] args) {
            LinkedList ll = new LinkedList<String>();
            ll.add("Demo");
            ll.add("Collection");
            ll.add("for");
            ll.add("LinkedList");

            System.out.println(ll);

            System.out.println("LinkedList contains for");
            System.out.println(ll.contains("for"));

            System.out.println("Add again at second index");
            ll.add(2,"Again");
            System.out.println(ll);

            System.out.println("Add fisrt using addFirst method");
            ll.addFirst("First");
            System.out.println(ll);
            System.out.println("Add last using addLast method");
            ll.addLast("Last");
            System.out.println(ll);

            System.out.println("print size of list");
            System.out.println(ll.size());

            System.out.println("remove for from list");
            ll.remove("for");
            System.out.println(ll);

            System.out.println("print index of linkedlist");
            System.out.println(ll.indexOf("LinkedList"));

            System.out.println("Print lastIndexOf after repeating few values");
            ll.add("Demo");
            ll.add("12345678");
            System.out.println(ll);
            System.out.println(ll.lastIndexOf("Demo"));



        }
    }

