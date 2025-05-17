package com.cydeo.prc.javacoding;

public class AmstrongNumber {
    public static void main(String[] args) {
        int num=153;
        amstrongNum(num);
    }
    public static void amstrongNum(int n){
        String strNumber=""+n;
        int sum=0;
        int nLen=strNumber.length();

        for(int i=0;i<nLen;i++){
            int eachDigit=Integer.parseInt(strNumber.substring(i,i+1));
          sum+=Math.pow(eachDigit,nLen);

        }
        System.out.println("sum--->"+sum);
        if(sum==n){
            System.out.println("given number is Amstrong---"+n);
        }
    }
}
