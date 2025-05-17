package com.cydeo.prc.javacoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class removeName34 {
    public static List<String> removeOneName(List<String> allnamesList){
        int sizeOfArr=allnamesList.size();
        allnamesList.removeIf(p->p.equals("Reethu"));
        System.out.println("allnamesList = " + allnamesList);
        return allnamesList;
    }
    public static List<String> removeOneNameIterator(List<String> allNames){
        Iterator<String> iterator=allNames.iterator();
        while(iterator.hasNext()){
            if(iterator.next().equals("Kalva")){
                iterator.remove();
            }

        }
        System.out.println("allNames in iterator = " + allNames);
        return allNames;
    }


    public static void main(String[] args) {
        List<String> allNames=new ArrayList<>(Arrays.asList("Gayathri","Reethu","Kalva"));
        //removeOneName(allNames);
        removeOneNameIterator(allNames);
    }
}
