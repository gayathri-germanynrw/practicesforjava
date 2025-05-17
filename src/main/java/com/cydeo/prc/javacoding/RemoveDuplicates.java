package com.cydeo.prc.javacoding;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String givenStr="AABBCCCC";
        String s1="";
        System.out.println("givenStr.charAt(0) = " +givenStr.charAt(0));
        String result= removeDup(givenStr);
        System.out.println("result = " + result);
    }
    public static String removeDup(String givenStr){
        int strLen=givenStr.length();
        String resultStr="";
        for(int i=0;i<strLen;i++){
            if(resultStr.indexOf(givenStr.charAt(i))==-1){
                resultStr=resultStr+givenStr.charAt(i);
            }
        }
return resultStr;
    }
}
