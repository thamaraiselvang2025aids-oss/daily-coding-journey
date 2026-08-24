import java.util.*;

public class Average {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of array: ");
        int n=sc.nextInt();
        System.out.println("Enter the element for Array : ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        double average;
        for (int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        average=(double) sum/n;
        System.out.println("Average: "+average);
    }
}
