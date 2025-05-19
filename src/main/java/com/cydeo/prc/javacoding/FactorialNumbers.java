package com.cydeo.prc.javacoding;

public class FactorialNumbers {

    public static void main(String[] args) {
      //  int result=fact(5);
       // System.out.println("result = " + result);
        int resultFacNum=3;
        int resultVal=fac(resultFacNum);
        System.out.println("resultVal = " + resultVal);
    }

    public static int fac(int n){
        if(n==1){
            return 1;
        }
        return n*fac(n-1);
    }

public static int factorial(String[] args) {
    int num=5;
    int result = 1;
    while(num>1){
        result*=num--;
    }
    return result;
}

 public static int fact(int n){
    if(n==1){
        return 1;
    }
    return n*fact(n-1);
 }


}
