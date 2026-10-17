package problem4.after;

public class Student implements Learner {
    private final String name;

    public Student(String name) {
        this.name= name;
    }

    @Override
    public void enrollInCourse(String code) {
        System.out.println(name + " enrolls in " + code);
    }

    @Override
    public void payTuition(double amount) {
        System.out.println(name + " pays " + amount + " MAD");
    }
}