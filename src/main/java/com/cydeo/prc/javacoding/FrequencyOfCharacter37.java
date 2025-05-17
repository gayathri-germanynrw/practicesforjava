package com.cydeo.prc.javacoding;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacter37 {
    // Frequency of character ("banana apple pie")
    public static void main(String[] args) {
        //String str="banana apple pie";
        String str="aaabbbccc";
        freqOfChar(str);
    }
    public static void freqOfChar(String str){
        Map<Character,Integer> mapObject=new LinkedHashMap<>();
        StringBuilder resultstr=new StringBuilder();
        // Key -each char and value - is the frequency
        for(int i=0;i<str.length();i++){
            char eachCharKey=str.charAt(i);
            System.out.println("mapObject.containsKey(eachChar)) = " + mapObject.containsKey(eachCharKey));
              if(!mapObject.containsKey(eachCharKey)){
              // Frequency of character ("banana apple pie")
                  mapObject.put(eachCharKey,0);
            }

           // System.out.println("mapObject.get(eachChar) = " + mapObject.get(eachCharKey));
           // System.out.println("mapObject.get(eachChar) = " + mapObject.get(eachCharKey));
            mapObject.put(eachCharKey,mapObject.get(eachCharKey)+1);
            System.out.println("result = " + eachCharKey+mapObject.get(eachCharKey));



        }
        System.out.println("mapObject = " + mapObject);
        for(Map.Entry<Character,Integer> entry:mapObject.entrySet()){

            resultstr.append(entry.getKey()).append(entry.getValue());
        }
        System.out.println("resultstr In Stringbuilder  = " + resultstr.toString());



    }
}
