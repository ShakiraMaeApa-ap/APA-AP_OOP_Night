package apa.ap_oop_night;

import java.util.Scanner;

public class APAAP_OOP_Night {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the message: ");
        String message = input.nextLine();

        String result = checkString(message);
        System.out.println(result);
    }

    public static String checkString(String str) {
        boolean FirstLetterCapital = false;
        boolean MisplacedCapitalization = false;

        if (Character.isUpperCase(str.charAt(0))) {
            FirstLetterCapital = true;
        }

        for (int i = 1; i < str.length(); i++) {
            char currentLetter = str.charAt(i);
            char previousLetter = str.charAt(i - 1);

            if (Character.isUpperCase(currentLetter) && Character.isLetter(previousLetter)) {
                MisplacedCapitalization = true;
                break;
            }
        }

        if (MisplacedCapitalization) {
            return "JEJE!";
        } else {
            return "uWu";
        }
    }
}
