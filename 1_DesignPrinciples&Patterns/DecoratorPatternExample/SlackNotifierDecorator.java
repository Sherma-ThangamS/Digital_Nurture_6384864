package code.week1.DecoratorPatternExample;

public class SlackNotifierDecorator extends NotifierDecorator{

    SlackNotifierDecorator(Notifier notifier){
        super(notifier);
    }

    @Override
    public void sendMessage(String message) {
        super.sendMessage(message);
        System.out.println("Sending Slack Message: "+message);
    }
}
