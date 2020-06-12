package com.multiplatform;

public class Main {

    public static void main(String[] args) {
	    printMessage("Rischa");
	    int res = addition(0, 0);
        System.out.println("Result "+ res);
    }
    public static void  printMessage(String name){
        System.out.println("Hello "+ name);
    }
    public  static int addition(int a, int b){
        if(a == 0 && b == 0){
            return  -1;
        }
        int result = a + b;
        return result;
    }
}
