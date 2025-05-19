package com.cydeo.prc.javacoding;

import java.util.*;

public class Stream_SqureTheNumbers {
    public static void main(String[] args) {
        //square_fun();
        filter_funstion();
    }
    public static void square_fun(){
        List<Integer> numbers=new ArrayList<>(Arrays.asList(5,1,4,6,8,9));

        List<Integer> squred_Numbers=numbers.stream().map(p->p*p).toList();
        System.out.println(squred_Numbers);
    }
    public static void filter_funstion(){
        List<Integer> numbers=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        int mul_even=numbers.stream().filter(n->n%2==0).reduce(1,(a,b)->(a*b));
        System.out.println("mul_even = " + mul_even);
    }
}
