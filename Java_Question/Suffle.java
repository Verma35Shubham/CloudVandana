package Java_Question;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Suffle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Length of Array: ");
        int n = sc.nextInt();
        System.out.println();
        int[] arr = new int[n];
        System.out.print("Enter Your Array Value: ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        suffleArray(arr, n);

        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }

    private static void suffleArray(int[] arr, int n) {
        List<Integer> list = new ArrayList<>();
        for(int num : arr){
            list.add(num);
        }
        Collections.shuffle(list);
        for(int i = 0; i<n; i++){
            arr[i] = list.get(i);
        }
    }
}
