package com.cydeo.prc.javacoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionListCustomMap {

    public static <T,R> List<R> customMap(List<T> inputList , Function<T,R> func){
        List<R> resultList=new ArrayList<>();
    for(T Item:inputList){
        resultList.add(func.apply(Item));
    }
        return resultList;
    }
    public static void main(String[] args) {
       List<Integer> inputList=new ArrayList<>(Arrays.asList(1,2,3,4));

       List<Integer> doubled=customMap(inputList,x->x*5);
        System.out.println("doubled = " + doubled);
    }
}
