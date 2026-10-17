package problem4.after;

public class TeachingAssistant implements Learner, Teacher {
    private final String name;

    public TeachingAssistant(String name) {
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

    @Override
    public void teach(String code) {
        System.out.println(name + " teaches " + code);
    }

    @Override
    public void gradeExam(String code, int examId) {
        System.out.println(name + " grades " + code);
    }
}