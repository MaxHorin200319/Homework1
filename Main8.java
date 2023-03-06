package Homework1;

import java.util.Scanner;
public class Main8
{
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int num = reader.nextInt();
        if(num % 2 == 0) {
            System.out.print("число " +num + " парне");
        } else
            System.out.print("число " +num + " не парне");
    }
}
