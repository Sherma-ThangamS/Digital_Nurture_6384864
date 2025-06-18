package code.week1.ProxyPatternExample;

public class RealImage implements Image{

    private final String filename;

    public RealImage(String filename){
        this.filename=filename;
        loadFromRemoteServer();
    }

    private void loadFromRemoteServer(){
        System.out.println("Loading...");
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    public void display() {
        System.out.println("Displaying: "+filename);
    }
}
