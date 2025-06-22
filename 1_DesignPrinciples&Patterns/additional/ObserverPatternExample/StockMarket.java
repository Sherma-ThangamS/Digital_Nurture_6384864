package code.week1.ObserverPatternExample;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock {
    private List<Observer> observers = new ArrayList<>();
    private String stockName;
    private double stockPrice;

    public StockMarket(String stockName) {
        this.stockName = stockName;
    }

    public void setStockPrice(double price) {
        this.stockPrice = price;
        System.out.println("\n[StockMarket] " + stockName + " price updated to $" + stockPrice);
        notifyObservers();
    }

    public double getStockPrice() {
        return stockPrice;
    }

    public String getStockName() {
        return stockName;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
        System.out.println("[StockMarket] Observer registered: " + observer.getClass().getSimpleName());
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        System.out.println("[StockMarket] Observer removed: " + observer.getClass().getSimpleName());
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(stockName, stockPrice);
        }
    }
}
