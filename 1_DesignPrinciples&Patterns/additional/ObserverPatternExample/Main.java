package code.week1.ObserverPatternExample;

public class Main {
    public static void main(String[] args) {

        StockMarket appleStock = new StockMarket("AAPL");

        Observer mobileUser = new MobileApp("Alice");
        Observer webUser = new WebApp("Bob");

        appleStock.registerObserver(mobileUser);
        appleStock.registerObserver(webUser);

        appleStock.setStockPrice(150.75);
        appleStock.setStockPrice(155.20);

        appleStock.removeObserver(webUser);

        appleStock.setStockPrice(160.00);
    }
}

