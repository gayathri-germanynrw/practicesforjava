package com.cydeo.prc.javacoding;

import java.util.*;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr1={20,30,30,20,40,10};
        Set<Integer> set=new LinkedHashSet<>();
        for(int val:arr1){
            set.add(val);
        }
        System.out.println("set = " + set);
        int[] resultArray=new int[set.size()];
        int i=0;
        for(int each:set){
            resultArray[i++]=each;
        }
        System.out.println("Arrays.toString(resultArray) = " + Arrays.toString(resultArray));
        
    }
}
