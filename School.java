package school.management.system;
import java.util.List;

/**
 * Created by Mohd Danish
 */
public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneySpent;
    private static int totalMoneyEarnt;

    public School(List<Student> students,List<Teacher> teachers) {
        this.students = students;
        this.teachers=teachers;
        totalMoneyEarnt=0;
        totalMoneySpent=0;
    }

    public void addStudents(Student student) {
        students.add(student);
    }

    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    public static void updateTotalMoneyEarnt(int MoneyEarnt) {
        totalMoneyEarnt +=MoneyEarnt;
    }

    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneySpent+=moneySpent;

    }



    public List<Student> getStudents() {
        return students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public int getTotalMoneyEarnt() {
        return totalMoneyEarnt-totalMoneySpent;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public int getTotalFeesReceived() {
        return totalMoneyEarnt;
    }


}
