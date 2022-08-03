package behavior_iterator_pattern.code.rollcall.collection;

import behavior_iterator_pattern.code.rollcall.iterator.Iterator;
import behavior_iterator_pattern.code.rollcall.iterator.StudentIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentCollection extends BaseCollection<Student>{

    private List<Student> students = new ArrayList<>();

    @Override
    public Iterator<Student> createIterator() {
        return new StudentIterator(this);
    }

    public void add(Student student) {
        students.add(student);
    }

    public void remove(Student student) {
        students.remove(student);
    }

    public void addAll(Student ...student) {
        List<Student> students1 = Arrays.asList(student);
        students.addAll(students1);
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public int size() {
        return students.size();
    }
}
