package code.week1.ObserverPatternExample;

public class WebApp implements Observer {
    private String user;

    public WebApp(String user) {
        this.user = user;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println("[WebApp] " + user + ", stock update: " + stockName + " = $" + price);
    }
}
