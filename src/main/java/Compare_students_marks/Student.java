package Compare_students_marks;

import java.util.ArrayList;

public class Student implements Comparable<Student> {

    private int totalMark;
    private String name;
    private ArrayList<String> subjects;
    private ArrayList<Integer> marks;

    //The constructor for the student class
    public Student(String name) {
        this.name = name;
        subjects = new ArrayList<String>();
        marks = new ArrayList<Integer>();
    }

    //The getter method for the name
    public String getName() {
        return name;
    }

    //The addMarks method
    public void addMarks(String subject, int mark) {
        subjects.add(subject);
        marks.add(mark);  //Autoboxing done for us
        totalMark = totalMark + mark;  //Initialization has been done during instantiation
    }

    public int compareTo(Student other) {
        if (this.totalMark > other.totalMark) {
            return 1;
        }
        else if (this.totalMark == other.totalMark) {
            return 0;
        }
        else {
            return -1;
        }
    }


}
