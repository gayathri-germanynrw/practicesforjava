package com.cydeo.prc.javacoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListProcess {
    /*Array/List Processing
    Implement a function that finds duplicate elements in an array and returns them as a new array.
            python# Example: findDuplicates([1, 2, 3, 4, 2, 5, 6, 3]) should return [2, 3] */

    public static void main(String[] args) {
        List<Integer> inputList=new ArrayList<>(Arrays.asList(1, 2, 3, 4, 2, 5, 6, 3));
        removeDup(inputList);

    }
    public static List<Integer> removeDup(List<Integer> inputList){

        int sizeOfList=inputList.size();
        System.out.println("sizeOfList = " + sizeOfList);
       List<Integer> resList=new ArrayList<>();
        //Iterator<Integer> listIter=inputList.iterator();
       for(int i=0;i<sizeOfList;i++){

            if(!resList.contains(inputList.get(i))){
                resList.add(inputList.get(i));
            }

        }

        System.out.println("resList = " + resList);
        return resList;
    }

}
