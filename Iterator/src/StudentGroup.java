import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;


public class StudentGroup implements Iterable<Student> {
    ArrayList<Student> studentList = new ArrayList<>();

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void printStudents() {
        Iterator<Student> it = studentList.iterator();
        for (Student s : studentList) {
            System.out.println(s.getName() + " " + s.getGrade());
        }
    }
    public void getFilteredIterator(Student student1)
    {
        Predicate<Student> predicate = student -> (student.getGrade()>3);
        System.out.println(predicate.test(student1));
    }
    private final class StudentGroupIterator implements Iterator<Student> {
        int index = 0;

        @Override
        public boolean hasNext() {
            return this.index >= 0;

        }

        @Override
        public Student next() {
            Student student = studentList.get(index);
            return student;

        }
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator();
    }

    public static void main(String[] args) {
        Student first = new Student("Ivan", 5);
        Student second = new Student("Kiro", 3);
        Student third = new Student("Motko", 2);


        StudentGroup student = new StudentGroup();
        student.addStudent(first);
        student.addStudent(second);
        student.addStudent(third);

        student.printStudents();
        student.getFilteredIterator(third);
    }
}