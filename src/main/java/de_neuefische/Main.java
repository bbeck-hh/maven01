package de_neuefische;

public class Main {
    public static void main(){
        System.out.println("Hello World");
    }

    public static int calcSum(int a, int b) {
        return a+b;
    }

    public static int calcProduct(int a, int b) {
        return a*b;
    }

    public static boolean isEven(int a) {
        if (a%2 == 0){
            return true;
        }
        return false;
    }

    public static String convertToUpperCase (String inputString){
        return inputString.toUpperCase();
    }

    public static boolean isPositiveNumber (int a){
        if (a%2 == 0){
            return true;
        }
        return false;
    }

}
