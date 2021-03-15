import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Palindrome of a number");
        System.out.println("Please enter number:");
        int n=sc.nextInt();
        int temp=n;
        int rev=0;
        while(n>0)
        {
            int s=n%10;
            rev=rev*10+s;
            n/=10;
        }
        if(temp==rev)
        System.out.println(temp+" is a Palindrome");
        else System.out.println(temp+" it is not a palindrome");
        System.out.println("Palindrome of String:");
        String s=sc.next();
        String revstring="";
        for(int i=s.length()-1;i>=0;i--){
            System.out.println(s.charAt(i));
            revstring+=s.charAt(i);

        }
        if(s.equalsIgnoreCase(revstring))
            System.out.println(s+" is a palindrome");
        else System.out.println(s+" is not palidrome");
    }
}
