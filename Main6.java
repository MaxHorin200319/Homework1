package Homework1;

import java.util.Scanner;
class Main6
{
    public static void main(String[] Strings)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Введіть a: ");
        double a = input.nextDouble();
        System.out.print("Введіть b: ");
        double b = input.nextDouble();
        System.out.print("Введіть с: ");
        double c = input.nextDouble();
        double d= b * b - 4.0 * a * c;
        if (d> 0.0)
        {
            double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
            System.out.println("Корені " + r1 + " і " + r2);
        }
        else if (d == 0.0)
        {
            double r1 = -b / (2.0 * a);
            System.out.println("Корінь " + r1);
        }
        else
        {
            System.out.println("Коренів немає.");
        }
    }
}
