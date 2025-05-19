package com.cydeo.prc.javacoding;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] arr1={1,2,3,7,5,6};
        int[] arr2={10,40,50,60};
       int[] resArr= mergeMethod(arr1,arr2);
        System.out.println("Arrays.toString(resArr)    = " + Arrays.toString(resArr));
    }
    public static int[] mergeMethod(int[] a1,int[] a2){
        int[] mergedArray=new int[a1.length+a2.length];

        for(int i=0;i<a1.length;i++){
            mergedArray[i]=a1[i];
        }
        for(int i=0;i<a2.length;i++){
            mergedArray[i+a1.length]=a2[i];
        }
        System.out.println("mergedArray--------->"+mergedArray);


        return mergedArray;

    }
}
