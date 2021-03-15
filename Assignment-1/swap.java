public class swap {
    public static void main(String[] args) {
        System.out.println("Swapping of two number");
        int a=10,b=20,temp;
        System.out.println("Before Swapping A="+a+" B="+b);
        temp=a;a=b;b=temp;
        System.out.println("After Swapping A="+a+" B="+b);
        System.out.println("\n Swapping of two number without using temp variable");
        System.out.println("Before Swapping A="+a+" B="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping A="+a+" B="+b);
    }
}
