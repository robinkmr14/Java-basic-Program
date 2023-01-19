// Write a program to find gross salary.

import java.util.*;

class grossSalary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float GrossSalary, basic, da, hra, da1, hra1;

        System.out.println("Enter Employee basic salary : ");
        basic = sc.nextInt();

        System.out.println("Enter DA : ");
        da1 = sc.nextInt();

        System.out.println("Enter HRA : ");
        hra1 = sc.nextInt();

        da = (da1 * basic) / 100f;
        hra = (hra1 * basic) / 100f;

        GrossSalary = basic + da + hra;

        System.out.println("Gross Salary of the Employee : " + GrossSalary);
        sc.close();

    }
}
