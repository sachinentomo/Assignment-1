import java.util.Scanner;

public class sum {
    public static int sum_recursion(int n)
    {
        int result=n<=0?n:n+sum_recursion(n-1);
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Sum of numbers (Non- Recursive & Recursive way");
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter a number");
        int n=sc.nextInt();
        int r=n;
        System.out.println(r);
        int result=0;
        System.out.println("Using Non Recursion");
        while(n>0)
        {
            result+=n--;
        }
        System.out.println(result);
        System.out.println("Using Recursion");
        System.out.println(sum_recursion(r));


    }
}
