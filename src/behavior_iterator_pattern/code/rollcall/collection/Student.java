package behavior_iterator_pattern.code.rollcall.collection;

import behavior_iterator_pattern.code.rollcall.iterator.Iterator;
import behavior_iterator_pattern.code.rollcall.iterator.StudentIterator;

public class Student{

    private String name;
    private Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
