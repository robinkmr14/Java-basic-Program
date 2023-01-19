// Write a program to Read Two Numbers and Print Their Quotient and Remainder.

import java.util.*;

class read {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second number : ");
        int num2 = sc.nextInt();

        int Quotient = 0;
        int Remainder = 0;

        Quotient = num1 / num2;
        Remainder = num1 % num2;

        System.out.println("Quotiemt of " + num1 + " / " + num2 + " is : " + Quotient);
        System.out.println("Quotiemt of " + num1 + " % " + num2 + " is : " + Remainder);
        sc.close();

    }
}