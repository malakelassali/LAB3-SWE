package problem5.before;

public class EmailSender {
    private final String address;
    public EmailSender(String address) {
        this.address= address;
    }
    public void send(String person, String message) {
        System.out.println("[Email to " + person + "] " + message);
    }
}