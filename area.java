// Write a program to Calculate Area of Rectangle, Squar

import java.util.*;

class area {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float area, length, Width, side;
        System.out.println("Enter [1] to find Area of Rectangle : ");
        System.out.println("Enter [2] to find Area of Squar     : ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1: {

                System.out.println("Enter length : ");
                length = sc.nextFloat();
                System.out.println("Enter width : ");      
                Width = sc.nextFloat();
                area = length * Width;
                System.out.println("Area of Rectangle : " + area + "cm\u00b2");
                break;
            }

            case 2: {

                System.out.println("Enter side : ");
                side = sc.nextFloat();

                area = side * side;

                System.out.println("Area of squar : " + area + "cm\u00b2");
                break;

            }

        }
        sc.close();
    }
}