package Homework1;

import java.util.Scanner;
class Main2 {

    public static void main(String[] args) {
        int input = 0, sum = 0, i = 0;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a number: ");
            input = sc.nextInt();
            sum += input;
            i++;
        } while (input != 0);

        System.out.print("Sum: "+ sum);
        System.out.print("\nAvg: " + (sum / i));
    }
}
