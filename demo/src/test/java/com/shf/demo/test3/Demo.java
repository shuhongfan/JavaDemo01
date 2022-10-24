package com.shf.demo.test3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Demo {
    public static void main(String[] args) {
        System.out.println(42 == 42.0);

        ArrayList<String> list = new ArrayList<>();
        list.add("X");

        Collection<String> clist = Collections.unmodifiableCollection(list);
        clist.add("Y");

        System.out.println(list.size());


    }
}
