package com.cydeo.prc.javacoding;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class WordCount {
    //wordCount("Hello world. Hello again!") 
    // should return {"hello": 2, "world": 1, "again": 1}
    public static void main(String[] args) {
        String str = "Hello world. Hello again!";
        // Convert to lowercase and remove punctuation (keep only letters and spaces)
        String cleaned = str.toLowerCase().replaceAll("^A-Za-z//s", "");
        //cleaned = str.toLowerCase().replaceAll("s[!.]", "");

        // Split by whitespace
        String[] strArrOfWords = cleaned.split("\\s+");


        wordCnt(strArrOfWords);
    }

    public static void wordCnt(String[] strArrOfWords) {
        Map<String, Integer> mapObj = new LinkedHashMap<>();
        for (String eachWord : strArrOfWords) {

            System.out.println("eachWord= " + eachWord);
            if (!mapObj.containsKey(eachWord))
                mapObj.put(eachWord, 0);
            mapObj.put(eachWord, mapObj.get(eachWord) + 1);


            System.out.println("mapObj = " + mapObj);
        }
    }
}
        

