package com.cydeo.prc.javacoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDupliFromArray {
    public static void main(String[] args) {
        //String[] arra1={"Gayathri","Kasi","Chandra"};
        List<String> givenList=new ArrayList<>(Arrays.asList("Gayathri","Priya","Priya","Gayathri","Kasi","Chandra","Pranav","Dronav Sai"));
        List<String> res=removeDupFromArr(givenList);
        System.out.println("res = " + res);
    }
    public static List<String> removeDupFromArr(List<String> givenList){
        List<String> resList=new ArrayList<>();
        int n=givenList.size();
        for(int i=0;i<n;i++){
           // System.out.println("listOfStrings.get("+i+")=" +   givenList.get(i));
           // System.out.println("givenList.get(n-i-1)) = " + givenList.get(n-i-1));
            if(resList.indexOf(givenList.get(i))==-1){
                System.out.println("givenList.get(i) = " + givenList.get(i));
                resList.add(givenList.get(i));
                //System.out.println("resList = " + i +"  "+resList);
            }

        }

        return resList;
    }
}
