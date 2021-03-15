import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        System.out.println("Please enter a number to check if it Armstrong or not");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int rem,res=0,copy=number;
        while(number>0)
        {
            rem=number%10;
            res+=(int)Math.pow(rem,3);
            number/=10;
        }


            System.out.println(res==copy?copy+" is a Armstrong number":copy+" is not a Armstrong number");

    }
}
