package behavior_iterator_pattern.code.rollcall.iterator;

import behavior_iterator_pattern.code.rollcall.collection.Student;
import behavior_iterator_pattern.code.rollcall.collection.StudentCollection;

import java.util.List;

public class StudentIterator implements Iterator<Student> {

    private final StudentCollection studentCollection;

    private int currentIndex = 0;

    public StudentIterator(StudentCollection studentCollection) {
        this.studentCollection = studentCollection;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < studentCollection.getStudents().size();
    }

    @Override
    public Student getNext() {
        if (!hasNext()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        List<Student> students = studentCollection.getStudents();
        Student student = students.get(currentIndex);
        currentIndex++;
        return student;
    }
}
