import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class fibonacci {
    static int n1=0,n2=1,n3=0;
    static void fibonacci(int count)
    {
        if (count>0) {
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(n3+" ");
            fibonacci(count-1);
        }
    }
    static boolean isPerfectSquare(int x)
    {
        int s= (int)(Math.sqrt(x)*Math.sqrt(x));
        return (s==x);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range:");
        int count=sc.nextInt();
        System.out.print(n1+" "+n2+" ");
        fibonacci(count-2);

        System.out.println("\n Please enter number check if fibonacci or not:");
        int n=sc.nextInt();
        Predicate<Integer> isPerfectSquare=n1->{
            int x=(int)Math.sqrt(n1);
            return (x*x==n1);
        };
        Function<Integer,Boolean> isFibonacci=f->isPerfectSquare.test(5*f*f+4)|| isPerfectSquare.test(5*f*f-4);

        System.out.println(isFibonacci.apply(n)?n+" comes in fibonacci series":n+" does'nt comes in fibonacci series");
    }
}
