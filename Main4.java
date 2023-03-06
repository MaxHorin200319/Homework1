package Homework1;

public class Main4
{
    public static void main(String[] args){
        int n = 3;
        int m = 5;
        int a=10;
        int b=Math.abs(a-n);
        int c=Math.abs(a-m);
        if (b==c){
            System.out.print("Числа "+n +" і "+m + " рівнодалекі від "+a);
        }
        if(b>c){
            System.out.print("Число "+m+" ближче до "+a);
        }
        if (b<c) {
            System.out.print("Число "+n+" ближче до "+a);
        }
    }
}
