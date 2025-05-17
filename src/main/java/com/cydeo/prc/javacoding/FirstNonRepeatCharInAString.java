package com.cydeo.prc.javacoding;

public class FirstNonRepeatCharInAString {

    public static void main(String[] args) {
        String givenStr="XABBCCCDEC";
        String s1="";
       // System.out.println("givenStr.charAt(0) = " +givenStr.charAt(0));
        char result= findFirstNoRepeatChar(givenStr);
        if(result!=0){
            System.out.println("First non repeating char from given String = " + result);
        }else{
            System.out.println("no non repeating char from given String = " + result);
        }

        System.out.println("result = " + result);
    }
    public static char findFirstNoRepeatChar(String givenStr){
        int strLen=givenStr.length();
        System.out.println(strLen);
        String resultStr="";
        for(int i=0;i<strLen;i++){
            char current=givenStr.charAt(i);
            if(givenStr.indexOf(current)==givenStr.lastIndexOf(current)){
                System.out.println("current inside for if loops = " + current);
                //resultStr+=current;
                //System.out.println("resultStr = " + resultStr); // All non repeating char
              return current;

            }
        }
        return 0;
    }
}
