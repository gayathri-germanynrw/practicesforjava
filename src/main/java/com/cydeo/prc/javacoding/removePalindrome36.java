package com.cydeo.prc.javacoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class removePalindrome36 {
    // With Iterator also can do this same program
    public static void main(String[] args) {
        List<String> allWords=new ArrayList<>(Arrays.asList("MadaM","GAYATHRI","Java","AYYA","ANNA"));
        int totalWordCount=allWords.size();

        for(int i=0;i<totalWordCount;i++){
           // System.out.println("allWords[ "+i+" ] = " + allWords.get(i));
           if(isPolindrome(allWords.get(i))){
               System.out.println("POLINDROME "+"get("+i+")" + allWords.get(i));
           }else{
               System.out.println("NOT A POLINDROME "+"get("+i+")" + allWords.get(i));
           }

        }


    }
    public static boolean isPolindrome(String word){
        //System.out.println("word = " + word);
        boolean isPolindrome=true;
        for(int i=0;i<word.length()/2;i++){
            if(word.charAt(i)!=word.charAt(word.length()-1-i)){
                //System.out.println("word = inside for and if" + word);
                isPolindrome=false;
                break;
            }
        }
        return isPolindrome;
    }
}
