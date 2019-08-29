package Loops.Udemy;

import java.util.Scanner;

public class NumberPalindrome {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Give a number: ");
        int x = sc.nextInt();

        System.out.println(isPalindrome(x));

    }

    public static boolean isPalindrome(int number) {

        int reverse = 0;
        int newNumber = number;

        while (newNumber != 0) {
            int lastDigit = newNumber % 10;
            reverse = reverse * 10;
            reverse += lastDigit;
            newNumber /= 10;
        }
        if (number == reverse) {
            System.out.println("number: " + number);
            System.out.println("reverse number: " + reverse);
            System.out.print("Is Palidrom: ");
            return true;
        } else {
            System.out.println("number: " + number);
            System.out.println("reverse number: " + reverse);
            System.out.print("Is Palidrom: ");
            return false;
        }
    }
}
