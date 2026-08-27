//Move All Zeros to the End
import java.util.*;

public class DuplicateEndswithZero {
    public static void main(String[] args){
        System.out.println("Enter size of array: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result[]=new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            
                if(arr[i]!=0){
                    result[j]=arr[i];
                    j++;
                }
            
        }
        for(int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
