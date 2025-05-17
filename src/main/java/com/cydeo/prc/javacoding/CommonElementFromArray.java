package com.cydeo.prc.javacoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonElementFromArray {
    /*
    Write a function that finds the intersection of two arrays (common elements).
Java# Example: findIntersection([1, 2, 3, 4], [3, 4, 5, 6]) should return [3, 4]
     */
    public static void main(String[] args) {
        List<Integer> a1=new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> a2=new ArrayList<>(Arrays.asList(3, 4, 5, 6));
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<a1.size();i++){
            Integer val=a1.get(i);
            // check val from first list available in second and not be duplicated
            for(int j=0;j<a2.size();j++){
                //   if (val.equals(a2.get(j)) && !res.contains(val)) {
                if(val.equals(a2.get(j))&& (!res.contains(val))){
                    res.add(val);
                    break;
                }
            }
        }
        System.out.println("res---"+res);
    }
}
