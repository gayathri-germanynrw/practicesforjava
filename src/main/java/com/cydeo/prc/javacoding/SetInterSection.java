package com.cydeo.prc.javacoding;

import java.net.Inet4Address;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetInterSection {
    public static void main(String[] args) {
        Set<Integer> set1=new LinkedHashSet<>(Arrays.asList(1,3,4,4,5,6));
        Set<Integer> set2=new LinkedHashSet<>(Arrays.asList(4,5,6));

        Set<Integer> shared=new LinkedHashSet<>();
        for(int each:set1){
            if(set2.contains(each)){
                shared.add(each);
            }
        }
        System.out.println("shared---->"+shared);
    }
}
