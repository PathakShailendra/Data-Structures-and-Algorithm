package Arraylists;

import java.util.ArrayList;

public class testMyArrayList {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        System.out.println(list);
        System.out.println(list.size());
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        System.out.println(list.size());
        list.add(1,15);
        System.out.println(list);
        System.out.println(list.size());
        list.add(3,25);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.remove(0));
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.remove(3));
        System.out.println(list);
        System.out.println(list.size());
    }
}
