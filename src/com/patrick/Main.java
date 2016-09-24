package com.patrick;
import java.util.Scanner;
public class Main {
    double marathonDist = 26.2;
    static Scanner stringScanner = new Scanner(System.in);
    static Scanner numberScanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("This calculator will show you how long it will take you to train to run a distance. ");


        System.out.println("How many miles can you run now? ");
        double currentAbility = numberScanner.nextDouble();

        System.out.println("How many miles would like to be able to run? ");
        double distanceTarget = numberScanner.nextDouble();

        System.out.println("What percent will you increase each week? ");
        double weeklyIncrease = numberScanner.nextDouble();

        double runCalculator[] = new double[3];
        //Add user input to array.
        runCalculator[0] = currentAbility;
        runCalculator[1] = distanceTarget;
        runCalculator[2] = weeklyIncrease;
        System.out.println(runCalculator[2]);
        System.out.println(runCalculator);
        System.out.println(currentAbility*(1+weeklyIncrease));







    stringScanner.close();
    numberScanner.close();
    }
}