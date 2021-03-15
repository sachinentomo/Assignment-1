import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check it is prime or not");
        int n=sc.nextInt();
        System.out.println(n%2==0?n+" is not prime number":n+" is a prime number");
        System.out.println("Enter the Range of number now:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        while(a<=b)
        {
            System.out.println(a%2==0?a+" is not prime number":a+" is a prime number");
            a++;
        }
    }
}
