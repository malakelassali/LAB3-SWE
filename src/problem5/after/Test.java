package problem5.after;

public class Test {
    public static void main(String[] args) {
        StudentRepository repository=
                new CsvStudentRepository("students.csv");
        Notifier notifier= new SmsNotifier();
        EnrollmentService service=
                new EnrollmentService(repository, notifier);
        try {
            service.enroll("22885676", "SAFI Amal", "0612345678");
            service.enroll("22885676", "SAFI Amal", "0612345678");
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}