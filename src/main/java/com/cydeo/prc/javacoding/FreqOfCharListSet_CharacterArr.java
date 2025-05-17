package com.cydeo.prc.javacoding;

import java.util.*;

public class FreqOfCharListSet_CharacterArr {
    public static void main(String[] args) {
        String inputStr="aabbccdduuuuuuuxxxxxxxxxxxxxxxxxxxxxxrrrrrrrrrrrr";
        String outStr="";
        char[] charray=inputStr.toCharArray();
        List<Character> inputList=new ArrayList<>();
        for(int i=0;i<charray.length;i++){
            inputList.add(charray[i]);
        }
        System.out.println("inputList--->"+inputList);

        Set<Character> uniqueChars=new LinkedHashSet<>(inputList);
        System.out.println("uniqueChars---"+uniqueChars);
        for (char c : uniqueChars) {
            int count = 0;
            for (int i=0;i<inputList.size();i++) {
                if (inputList.get(i) == c) count++;
            }
            outStr+= c + "   :   " + count+" \n ";
        }
        System.out.println("------>"+outStr);

    }



}
