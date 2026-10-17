package problem5.before;

public class EnrollmentService {
    private final CsvStudentStore store=
            new CsvStudentStore("students.csv");
    private final EmailSender sender=
            new EmailSender("smtp.example.com");

    public void enroll(String cne, String name, String email) {
        if (cne == null || cne.isBlank())
            throw new IllegalArgumentException("CNE is required");

        if (store.exists(cne))
            throw new IllegalStateException("Already enrolled: " + cne);
        store.append(cne, name, email);
        sender.send(email, "Welcome " + name + ", you are enrolled.");
    }
}