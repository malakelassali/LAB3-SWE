package problem4.before;

public class Professor implements UniversityMember {
    private final String name;
    public Professor(String name) {
        this.name= name;
    }

    @Override
    public void enrollInCourse(String code) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void payTuition(double amount) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void teach(String code) {
        System.out.println(name + " teaches " + code);
    }

    @Override
    public void gradeExam(String code) {
        System.out.println(name + " grades exams for " + code);
    }

    @Override
    public void publishPaper(String title) {
        System.out.println(name + " publishes " + title);
    }
}