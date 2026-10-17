package problem4.before;


public class Student implements UniversityMember {
    private final String name;
    public Student(String name) { this.name = name; }
    public void enrollInCourse(String code) {
        System.out.println(name + " enrolls in " + code);
    }
    public void payTuition(double amount) {
        System.out.println(name + " pays " + amount + " MAD");
    }
    public void teach(String code) {
        throw new UnsupportedOperationException();
    }
    public void gradeExam(String code) {
        throw new UnsupportedOperationException();
    }
    public void publishPaper(String title) {
        throw new UnsupportedOperationException();
    }
}
