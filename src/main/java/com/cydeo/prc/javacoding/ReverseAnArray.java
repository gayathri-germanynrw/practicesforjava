package com.cydeo.prc.javacoding;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseAnArray {
    public static void main(String[] args) {
        //String[] arra1={"Gayathri","Kasi","Chandra"};
        List<String> givenList=new ArrayList<>(Arrays.asList("Gayathri","Kasi","Chandra","Pranav","Dronav Sai"));
        System.out.println("givenList = " + givenList);
        List<String> res=revArray(givenList);
        System.out.println("res = " + res);
    }
    public static List<String> revArray(List<String> givenList){
        List<String> resList=new ArrayList<>();
        for(int i=givenList.size()-1;i>=0;i--){
            System.out.println("listOfStrings.get("+i+")=" +   givenList.get(i));

            resList.add(givenList.get(i));
        }

        return resList;
    }
}
