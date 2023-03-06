package Homework1;

import java.util.Scanner;
public class Main5
{
    public static void main(String[] args)
    {
        int day = 0;
        boolean b = true;
        Scanner in = new Scanner(System.in);
        System.out.print("Введіть номер дня тижня:");
        day = in.nextInt();
        if ((day == 1) || (day == 2) || (day == 3) || (day == 4))
        {
            System.out.print("В цей день 4 пари.");
            in.close();
        }
        else if (day == 5)
        {
            System.out.print("В цей день 3 пари.");
            in.close();
        }
        else if ((day == 6) || (day == 7))
        {
            System.out.print("В цей день вихідний.");
            in.close();
        }
    }
}
