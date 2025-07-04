package com.cydeo.prc.javacoding;

import java.util.*;

public class pracFreqSort {
    // b=2,a=5,c=1
    public static void main(String[] args) {
        Map<String, Integer> map=Map.of("x",10,"b",2,"a",5,"c",1);
        System.out.println("Original Map = " + map);
        System.out.println("Sorted map = " +  freqSort(map));
    }
    public static Map<String, Integer> freqSort(Map<String,Integer> mapObject){
        List<Map.Entry<String,Integer>> entries=new ArrayList<>(mapObject.entrySet());
        for(int i=0;i<entries.size();i++){
            for(int j=0;j<entries.size()-1;j++){
                if(entries.get(j).getValue()>entries.get(j+1).getValue()){
                    Map.Entry<String,Integer> temp=entries.get(j);
                    entries.set(j,entries.get(j+1));
                    entries.set(j+1,temp);
                }
            }

        }
        Map<String,Integer> sorted =new LinkedHashMap<>();
        for(Map.Entry<String,Integer> each:entries){
            sorted.put(each.getKey(),each.getValue());
            //System.out.println("each = " + each);
        }
        return sorted;
    }
}



