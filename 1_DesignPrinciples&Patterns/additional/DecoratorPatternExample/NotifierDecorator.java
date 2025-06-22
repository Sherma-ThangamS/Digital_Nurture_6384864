package code.week1.DecoratorPatternExample;

public abstract class NotifierDecorator implements  Notifier{

    private Notifier notifier;

    NotifierDecorator(Notifier notifier){
        this.notifier=notifier;
    }

    @Override
    public void sendMessage(String message) {
        notifier.sendMessage("Base Decorator: "+message);
    }
}
