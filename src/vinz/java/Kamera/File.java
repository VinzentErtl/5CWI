package vinz.java.Kamera;

public class File {
    public int size;
    public String exkusion;
    public String name;

    public File(int size, String exkusion, String name) {
        this.size = size;
        this.exkusion = exkusion;
        this.name = name;
    }
   
    public String getExkusion() {
        return exkusion;
    }
    public String getName() {
        return name;
    }
    public int getSize() {
        return size;
    }

    public void setExkusion(String exkusion) {
        this.exkusion = exkusion;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSize(int size) {
        this.size = size;
    }
}
