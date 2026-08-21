import java.util.Arrays;
import java.util.Scanner;

class ReverseArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the input: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Output: ");
        for (int i=0; i<arr.length;i++){        //length is property, not method
            System.out.println(arr[i]);
        }

        Arrays.sort(arr);
        System.out.println("Sorting order Output: ");
        for (int i=0; i<arr.length;i++){        //sorting an array and display output
            System.out.println(arr[i]);
        }

        System.out.println("Reverse Output: ");
        for (int i=0; i<arr.length/2;i++){        //reverse array
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


    }
}