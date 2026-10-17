package problem5.after;

public class EmailNotifier implements Notifier {
    private final String address;
    public EmailNotifier(String address) {
        this.address= address;
    }
    @Override
    public void notify(String to, String message) {
        System.out.println("[Email to " + to + "] " + message);
    }
}