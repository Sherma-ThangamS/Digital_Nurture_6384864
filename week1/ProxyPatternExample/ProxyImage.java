package code.week1.ProxyPatternExample;

public class ProxyImage implements Image{
    private final String filename;
    private RealImage realImage;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            System.out.println("Creating RealImage for: " + filename);
            realImage = new RealImage(filename);
        } else {
            System.out.println("Using cached RealImage for: " + filename);
        }
        realImage.display();
    }
}
