package code.week1.DecoratorPatternExample;

public class Main {
    public static void main(String[] args) {

        Notifier emailNotifier = new EmailNotifier();

        Notifier emailAndSMSNotifier = new SMSNotifierDecorator(emailNotifier);

        Notifier allChannelNotifier = new SlackNotifierDecorator(emailAndSMSNotifier);

        allChannelNotifier.sendMessage("Server is down!");
    }
}
