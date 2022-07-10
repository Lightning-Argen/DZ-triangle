package com.company;

public class triangle {

    int a;
    int b;
    int c;

    void area (){
        float p = (a+b+c)/2;
double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println(p);
        System.out.println(String.format("%.2f",s));
    }
}
