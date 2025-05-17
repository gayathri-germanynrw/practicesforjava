package com.cydeo.prc.javacoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveMoreThan100Q35 {
    public static void main(String[] args) {
        List<Integer> allNumbers=new ArrayList<>(Arrays.asList(1000,390,28,93,400));
        Iterator<Integer> iterator=allNumbers.iterator();
        while(iterator.hasNext()){
            if(iterator.next()>100){
                iterator.remove();
               }
        }
        System.out.println("allNumbers in iterator = " + allNumbers);
    }
}
