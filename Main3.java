package Homework1;

class Main3
{
    public static void main(String[] args)
    {
        for (int i = 35; i <= 87;i++)
        {
            if ((i%7 == 1) || (i%7 == 2) || (i%7 == 5))
            {
                System.out.print(i);
                System.out.print(" ");
            }
        }
    }
}
