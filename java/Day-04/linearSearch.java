import java.util.*;

public class linearSearch {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        System.out.println("Enter the element "+n+" for array : ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element for search: ");
        int a=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==a){
                System.out.println("found");
                System.out.println("found at position: "+(i+1));
                System.out.println("found at position: "+i);
                break;
            }
        }
        
    }
}
