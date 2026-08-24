import java.util.*;

public class printEvenOdd {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count1 = 0;
        int count2 = 0;

        System.out.print("Even elements: ");

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
                count1++;
            }
        }

        System.out.print("\nOdd elements: ");

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
                count2++;
            }
        }

        System.out.println("\nEven count: " + count1);
        System.out.println("Odd count: " + count2);
    

    }
}
