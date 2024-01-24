package MusaPackage12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);

        System.out.println("Please enter unit one");
        String unit1 = input.next().toLowerCase(); // Convert to lowercase for case-insensitivity
        System.out.println("Please enter unit 2");
        String unit2 = input.next().toLowerCase(); // Convert to lowercase for case-insensitivity
        System.out.println("Please enter unit 3");
        double unit3 = input.nextDouble();

        double feetToMetersConversion = 0.3048;
        double poundToKgConversion = 0.45359237;

        if (unit1.equals("feet") && unit2.equals("meters")) {
            double result = unit3 * feetToMetersConversion;
            System.out.println(unit3 + " feet is equal to " + result + " meters");
        } else if (unit1.equals("pound") && unit2.equals("kg")) {
            double result = unit3 * poundToKgConversion;
            System.out.println(unit3 + " pounds is equal to " + result + " kilograms");
        } else if (unit1.equals("fahrenheit") && unit2.equals("celsius")) {
            double result = (unit3 - 32) / 1.8;
            System.out.println(unit3 + " Fahrenheit is equal to " + result + " Celsius");
        } else {
            System.out.println("Enter valid units for conversion.");
        }
    }
    }


