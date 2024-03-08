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

    public static String convertToUpperCase(String inputString) {
        return inputString.toUpperCase();
    }

    public static boolean isPositiveNumber(int a) {
        if (a > 0) {
            return true;
        }
        return false;
    }

    // Task link: https://www.codewars.com/kata/56a4addbfd4a55694100001f/javascript
    public static boolean checkIfSheSaidHallo(String text) {
        String insensitiveText = text.toLowerCase();
        String ignoreForeignCharacters = insensitiveText.replaceAll("[^a-zA-Z\\d\\s:]", " ");
        System.out.println(ignoreForeignCharacters);
        String[] convertedTextToArray = ignoreForeignCharacters.split(" ");

        String[] possiblePeopleHelloes = {"hello", "ciao", "salut", "hallo", "hola", "ahoj", "czesc"};

        for (String arrayText : convertedTextToArray) {
            for (String possibleHello : possiblePeopleHelloes) {
                if (arrayText.equals(possibleHello)) {
                    return true;
                }
            }
        }

        return false;
    }

}
