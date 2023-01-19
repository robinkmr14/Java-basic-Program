// Write a program to Find the Average of Three Numbers.

import java.util.*;

class average {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second number : ");
        int num2 = sc.nextInt();
        System.out.println("Enter third number : ");
        int num3 = sc.nextInt();

        float Average = (num1 + num2 + num3)/ 3f;

        System.out.println("Average of three numbers : " + Average);
        sc.close();
    }
}