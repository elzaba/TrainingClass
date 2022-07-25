import java.util.Scanner;
public class LargeSmall{
    public static void main(String[] args){
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array: ");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        int smallest = a[0];
        int largest = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > largest)
                largest = a[i];
            else if (a[i] < smallest)
                smallest = a[i];
        }
        System.out.println("Largest Number is : " + largest);
        System.out.println("Smallest Number is : " + smallest);
 }
}
