// Write a program to Calculate Sum of 5 Subjects and Find Percentage (Max Mark in each subject is 100).

import java.util.*;

class percentage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first subjects : ");
        int sub1 = sc.nextInt();
        System.out.println("Enter Second subject : ");
        int sub2 = sc.nextInt();
        System.out.println("Enter third subject : ");
        int sub3 = sc.nextInt();
        System.out.println("Enter third subject : ");
        int sub4 = sc.nextInt();
        System.out.println("Enter third subject : ");
        int sub5 = sc.nextInt();

        int sum = sub1 + sub2 + sub3 + sub4 + sub5;
        System.out.println("Sum of five subjects : " + sum);

        float percentage = ((sub1 + sub2 + sub3 + sub4 + sub5) * 100) / 500;
        System.out.println("Percentage of five subjects : " + percentage);
        sc.close();
    }
}
