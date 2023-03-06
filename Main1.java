package Homework1;

public class Main1 {
    static class sum {
        public static void main(String[] args){
            int n = 4;
            int sum = 0;
            int i = 1;
            do {
                sum = sum + i;
                i++;
            } while (i <= n);
            System.out.print("Sum is " + sum);
        }
    }
}
