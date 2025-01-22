package vinz.java.Datate;

import java.util.Random;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] data = new int[400000];

        // Generating 10,000 random numbers
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(4000000);
        }

        // Display a snippet of the unsorted array
        System.out.print("Unsorted array snippet: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();

        long startTime = System.currentTimeMillis();
        bubbleSort(data);
        long endTime = System.currentTimeMillis();

        // Display a snippet of the sorted array
        System.out.print("Sorted array snippet: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();

        System.out.printf("Bubble sort on 400,000 elements took %.2f seconds.%n", (endTime - startTime) / 1000.0);
    }
}
