package code.week1.ObserverPatternExample;

public class MobileApp implements Observer {
    private String user;

    public MobileApp(String user) {
        this.user = user;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println("[MobileApp] " + user + ", new price of " + stockName + " is $" + price);
    }
}