package problem4.after;
import java.util.List;

public class ExamBoard {
    public void collectGrades(List<Teacher> teachers, String code) {
        for (Teacher teacher:teachers) {
            teacher.gradeExam(code, 1);
        }
    }
}