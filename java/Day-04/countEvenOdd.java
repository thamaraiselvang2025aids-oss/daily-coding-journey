//Count Even and Odd Elements

import java.util.*;

public class countEvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int count1=0;
        int count2=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                count1++;
            }
            else{
                count2++;
            }
        }
        System.out.println("The count of even : "+count1);
        System.out.println("The count of odd : "+count2);
    }
}
