package org.example;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Pick a number:");
        int x = sc.nextInt();
        System.out.println("Pick a new number:");
        int y = sc.nextInt();
        Add(x,y);

    }


    public static int Add(int a, int b){
        int result = a+b;
        System.out.println(result);
        return a+b;

    }
}