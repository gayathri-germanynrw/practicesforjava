package com.cydeo.prc.javacoding;

import java.util.*;

public class FreqOfStrings_ListSet {

        public static void main(String[] args) {
            String outStr="";
            List<String> inputList=new ArrayList<>(Arrays.asList("Gayathri","Kasi","Gayathri","Kasi","Priya","Rama","Rani"));
            System.out.println("inputList--->"+inputList);
            Set<String> uniqueStrings=new LinkedHashSet<>(inputList);
            System.out.println("uniqueStrings = from Set ----> " + uniqueStrings);
            for (String str : uniqueStrings) {
                int count = 0;
                for (int i=0;i<inputList.size();i++) {
                    if (inputList.get(i) == str) count++;
                }
                outStr+= str + "   :   " + count+" \n ";
            }
            System.out.println("------>"+outStr);
        }
    }


