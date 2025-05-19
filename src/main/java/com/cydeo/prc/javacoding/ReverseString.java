package com.cydeo.prc.javacoding;

public class ReverseString {
    public static void main(String[] args) {
        String givenStr="Gayathri Kasi Chandra";
        String res=revStr(givenStr);

        System.out.println("res = " + res);
    }
    public static String revStr(String str){
        String resStr="";
        System.out.println("str.length() = " + str.length());
        for(int i=str.length()-1;i>=0;i--){
            resStr=resStr+str.charAt(i);
            System.out.println("resStr = " + resStr);
        }
        System.out.println(resStr);
        return resStr;
    }
}
