package com.cydeo.prc.javacoding;

import java.util.LinkedHashMap;
import java.util.Map;

public class FreqOfChar {
    public static void main(String[] args) {
        String str="ABCCDGG";
        freqMethod(str);
    }
    public static void freqMethod(String str){
        Map<Character,Integer> mapobject=new LinkedHashMap<>();
        StringBuilder result_sb=new StringBuilder();
        for(int i=0;i<=str.length()-1;i++){
            char keyBuchstaben=str.charAt(i);


            if(!mapobject.containsKey(keyBuchstaben))
            {
                mapobject.put(keyBuchstaben,0);
            }
                mapobject.put(keyBuchstaben,mapobject.get(keyBuchstaben)+1);


        }
        System.out.println("mapobject--->"+mapobject);
        for(Map.Entry<Character,Integer> eachentry:mapobject.entrySet()){
            result_sb.append(eachentry.getKey()).append(eachentry.getValue());

        }
        System.out.println(result_sb.toString());


    }
}
