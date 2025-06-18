package code.week1.DecoratorPatternExample;

public class SMSNotifierDecorator extends NotifierDecorator {

    SMSNotifierDecorator(Notifier notifier){
        super(notifier);
    }

    @Override
    public void sendMessage(String message) {
        super.sendMessage(message);
        System.out.println("Sending SMS: "+message);
    }
}
