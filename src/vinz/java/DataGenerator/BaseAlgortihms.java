package vinz.java.DataGenerator;

public class BaseAlgortihms {
    public static int[] revert(int[] array) {
           
        int[] revertedArray = new int[array.length];
        for(int i = array.length - 1; i >= 0; i--) {
            revertedArray[i] = array[array.length - 1 - i];
        }
                                                
        return revertedArray;
    }

    public static int max(int[] data) {
            return 0;
        
        
        
    }

    public static int min( int[] data) {
            return 0;
        
    }


}
