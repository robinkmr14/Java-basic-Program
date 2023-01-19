// Write a program to Calculate Area of Scalene Triangle and Right-angle Triangle.

import java.util.*;
import java.math.MathContext;

class areaOfS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter [1] to find Area of Scalene Triangle : ");
        System.out.println("Enter [2] to find Area of Right-angle Triangle : ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1: {

                System.out.println("Enter side1 : ");
               float side1 = sc.nextInt();
                System.out.println("Enter side2 : ");      
               float side2 = sc.nextInt();
                System.out.println("Enter side3 : ");      
               float side3 = sc.nextInt();

               float area = (side1 + side2 + side3) / 2f;

                System.out.println("The Area of Scalene Triangle is : " +(Math.sqrt(area*(area-side1)*(area-side2)*(area-side3))));
                break;
            }

            case 2: {
                int base, hight, area;

                System.out.println("Enter base : ");
                base = sc.nextInt();

                System.out.println("Enter hight : ");
                hight = sc.nextInt();

                area = (base * hight)/2;

                System.out.println("Area of Right-angle Triangle : " + area + "square units");
                break;

            }

        }
        sc.close();
    }
}