import java.net.SocketOption;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(99);
        }
        
        ArrayOut(arr);

        System.out.println("Max: " + ArrayMax(arr));
        System.out.println("Min: " + ArrayMin(arr));
        System.out.println("Avg: " + ArrayAvg(arr));

        BubbleSort(arr);
    }

    static void BubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    Swap(arr, j, j + 1);
                }
            }
        }

        ArrayOut(arr);
    }

    static void Swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    
    static void ArrayOut(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    static int ArrayMax(int[] arr) {
        int result = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > result) {
                result = arr[i];
            }
        }

        return result;
    }

    static int ArrayMin(int[] arr) {
        int result = 100;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < result) {
                result = arr[i];
            }
        }

        return result;
    }

    static double ArrayAvg(int[] arr) {
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum / arr.length;
    }
}