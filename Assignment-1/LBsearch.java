import java.util.Scanner;

public class LBsearch {
    static void bubblesort(int arr[],int key){
        int first=0,mid,last=arr.length-1;
        mid=(first+last)/2;
        while(first<=last)
        {
            if(arr[mid]==key){
                System.out.println(key+" found at position "+(mid+1));
                break;
            }
            else if(arr[mid]<key)
                first=mid+1;
            else last=mid-1;
            mid=(first+last)/2;

        }
        if(first>last)
            System.out.println(key+" not found");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("-------Linear and Binary Search-------");
        System.out.print("\n Enter the range:");
        int n=sc.nextInt();
        int a[]=new int[n];
        int key;
        System.out.print("Enter the "+n+ " element:");
        for(int i=0;i<a.length;i++)
            a[i] = sc.nextInt();
        System.out.println("Enter the Search Element:");
        key=sc.nextInt();
        System.out.println("Using  Binary Search");
        bubblesort(a,key);
        System.out.println("Using Linear Search");
        for (int i = 0; i < a.length; i++)
            if(a[i]==key) {
                System.out.println(key + " found at position " + (i+1));
                System.exit(-1);
            }
        System.out.println(key+" not found in the array");


    }
}
