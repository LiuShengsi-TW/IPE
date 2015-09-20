/**
 * Created by ssliu on 9/19/15.
 */
import java.io.*;

public class Exercise {
    public static void main (String[] args) {
        // Print one asterisk to the console.
        System.out.print("There need to print one asterisks : ");
        System.out.println("*");

        //Print n asterisks on one line.
        final int N = 5;
        System.out.print("There need to print " + N + " asterisks on one line: ");
        for (int i = 0; i < N; i++) {
            System.out.print("* ");
        }
        System.out.println(" ");

        //Print n asterisks on one vertical line.
        System.out.print("There need to print " + N + " asterisks on one vertical line: \n");
        for (int i = 0; i < N; i++) {
            System.out.println("*");
        }

        //Print a right triangle.
        System.out.print("There need to print a right triangle: \n");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        //Print a centered triangle.
        System.out.print("There need to print a centered triangle: \n");
        for (int i = 0; i < 6; i++) {
            for (int m = 0; m <= 4-i; m++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        //Print a centered diamond.
        System.out.print("There need to print a centered diamond: \n");
        for (int i = 1; i <= 2*N-1; i++) {
            for (int j = 1; j <= Math.abs(N - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= N-Math.abs(i-N); k++) {
                    System.out.print("* ");
            }
            System.out.println();
        }
        //Print a centered diamond with your name in place of the middle line.
        System.out.print("There need to print a centered diamond: \n");
        for (int i = 1; i <= 2*N-1; i++) {
            for (int j = 1; j <= Math.abs(N - i); j++) {
                System.out.print(" ");
            }
            if (i == 5){
                System.out.print("Liu shengsi ");
            }
            for (int k = 1; k <= N-Math.abs(i-N); k++) {
                if (i != 5){
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }

        //FizzBuzz game.
        fizzBuzz();

        //generate(int n).
        generate(1);
        generate(30);

    }

    public static void fizzBuzz() {
        for(int i = 0; i <= 100; i++){
            if (i%(3*5) == 0){
                System.out.println("FizzBuzz");
            }else if (i%3 == 0){
                System.out.println("Fizz");
            }else if (i%5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }

    public static void generate(int n) {
        int num = n;
        System.out.print("The factors of "+ num + " is as below: \n");

        if (num == 1) {
            System.out.println("No factors!");
            return;
        }
        int k = 2;
        while (num > k) {
            if (num % k == 0) {
                System.out.print(k+", " );
                num = num / k;
            }
            if (num % k != 0) {
                k++;
            }
        }
        System.out.println(k);
    }

}
