//Count Occurrences of an Element

import java.util.*;

public class countOcuurence {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the element array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element that want to check: ");
        int target=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                count++;
            }
        }
        System.out.println("Count of "+target+" in array is "+count);
    }
}
