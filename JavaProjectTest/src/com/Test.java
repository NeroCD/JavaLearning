package com;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test extends Object {
    public static void main(String[] args) {
        Map<Integer, Integer> m = new HashMap<>();
        m.put(1,1);
        
    }
}

interface Inter {
    int TIME = 1;

    void fun(int a);
}

class test implements Inter {
    @Override
    public void fun(int a) {
        System.out.println(a + TIME);
    }
}