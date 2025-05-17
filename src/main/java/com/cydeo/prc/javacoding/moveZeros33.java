package com.cydeo.prc.javacoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class moveZeros33 {
    public static List<Integer> moveAllZerosToEnd(List<Integer> list){
        int originalSize=list.size();
        list.removeIf(p->p==0);
        int numOfZeros=originalSize-list.size();
        for(int i=0;i<numOfZeros;i++){
            list.add(0);

        }
        System.out.println("numOfZeros = " + numOfZeros);
        System.out.println("list = " + list);
        return list;
    }


    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(0,90,0,1,3,0,4,0,9,8,0,5));

    moveAllZerosToEnd(list);
    }
}
