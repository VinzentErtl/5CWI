package vinz.java.DataGenerator;

import java.util.Random;

public class DataGenerator {
    public static int[] generateDataArray(int size) {
        Random random = new Random();
        int[] data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = random.nextInt(); 
        }
        return data;
    }

    
    public static int[] generateDataArray(int size, int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("min darf nicht größer als max sein.");
        }
        Random random = new Random();
        int[] data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = random.nextInt((max - min) + 1) + min; 
        }
        return data;
    }

    
    public static void printArray(int[] data) {
        for (int value : data) {
            System.out.print(value + " ");
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        int[] randomData = generateDataArray(10);
        printArray(randomData);

        int[] rangedData = generateDataArray(10, 0, 100);
        printArray(rangedData);
    }
}
