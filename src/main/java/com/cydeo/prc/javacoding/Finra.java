package com.cydeo.prc.javacoding;

public class Finra {
    public static void main(String[] args) {
        int num=45;
        finramethod2(num);
    }
    public static void finramethod(int num){
        String result="";
        if(num%15==0){
            System.out.println("FINRA");
        }else if(num%3==0){
            System.out.println("FIN");
        }else if(num%5==0){
            System.out.println("RA");
        }
        else{
            System.out.println(num);
        }
    }
    public static void finramethod2(int num){
        String resultStr="";
        if(num%15==0){
            resultStr+="FINRA";
        }if(num%3==0){
            resultStr+="FIN";
        }if(num%5==0){
            resultStr+="RA";
        }
        System.out.println(resultStr.isEmpty()? num :"/"+resultStr);
    }
}
