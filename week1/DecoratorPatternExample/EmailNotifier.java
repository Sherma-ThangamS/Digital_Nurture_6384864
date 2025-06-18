package code.week1.DecoratorPatternExample;

public class EmailNotifier implements Notifier{

    @Override
    public void sendMessage(String message) {
        System.out.println("Email Message: "+message);
    }
}
