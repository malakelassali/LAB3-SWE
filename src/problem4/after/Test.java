package problem4.after;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Student student= new Student("SAFI Amal");
        TeachingAssistant ta= new TeachingAssistant("ALAMI Samir");
        Professor professor= new Professor("Prof. KALLOUBI");

        Registrar registrar= new Registrar();
        ExamBoard examBoard= new ExamBoard();
        List<Learner> learners= List.of(student, ta);
        List<Teacher> teachers= List.of(professor, ta);

        registrar.enrollAll(learners, "SE101");
        examBoard.collectGrades(teachers, "SE101");
    }
}