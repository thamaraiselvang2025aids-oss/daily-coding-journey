import java.util.*;

public class merge2array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of array 1 : ");
        int n1=sc.nextInt();
        System.out.println("Enter Size of array 2 : ");
        int n2=sc.nextInt();

        //input for arr1
        int[] arr1=new int[n1];
        System.out.println("Enter the element for array 1 :");
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }

        //input for arr2
        int[] arr2=new int[n2];
        System.out.println("Enter the element for array 2: ");
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }

        //merge array initialization
        int[] merged = new int[arr1.length + arr2.length];
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        //array 1 sorted 
        for (int i = 0; i < arr1.length; i++){
            merged[i] = arr1[i];
        }

        //array 2 storted and merge with array 1
        for (int i = 0; i < arr2.length; i++){
            merged[arr1.length + i] = arr2[i];
        }

        System.out.println("Two array merged : ");
        for(int i=0;i<merged.length;i++){
            System.out.print(merged[i]+" ");
        }
        System.out.println();
        Arrays.sort(merged);
        System.out.println("MERGED AND SORTED ARRAY: ");
        for(int i=0;i<merged.length;i++){
            System.out.print(merged[i]+" ");
        }

        System.out.println();
        System.out.println("Smallest Element: "+merged[0]);
        System.out.println("Largest Element : "+merged[merged.length-1]);
    }
}
