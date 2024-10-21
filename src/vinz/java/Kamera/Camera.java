package vinz.java.Kamera;

public class Camera {
    public int pixel;
    public int weight;

    public Camera(int pixel, int weight) {
        this.pixel = pixel;
        this.weight = weight;
    }

    public void takePicture(File file){
        System.out.println("Taking a picture " + file);
    }

    public void printAllPictures(File file) {
        
    }
}
