package com.company;

public class Main {
    public static void main(String[] args) {

        triangle triangle = new triangle();
        triangle.a = 5;
        triangle.b = 7;
        triangle.c = 9;
        triangle.area();
        System.out.println(triangle.a);
        System.out.println(triangle.b);
        System.out.println(triangle.c);

    }
}