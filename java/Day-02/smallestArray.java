import java.util.*;

class smallestArray{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of an array: ");
        int n=sc.nextInt();
        int[] arr = new int[n];
        sc.nextLine();
        System.out.print("Enter elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.nextLine();
        int min=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.print("smallest integer: "+min);
    }
}