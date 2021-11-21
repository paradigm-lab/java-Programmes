package Compare_students_marks;

public class marks {
    public static void main(String[] args) {
        /*
        Compare Student marks
        -> Check which student has a higher total marks
        -> Use compareTo method from Comparable interface
        -> Instantiate Student objects
        -> Get subjects and marks for each object
        -> Compare th total marks of 2 students
         */

        Student collin = new Student("Collin");
        collin.addMarks("Computer Programming", 95);
        collin.addMarks("Mathematics", 100);
        collin.addMarks("Computer Hacking", 98);

        Student Matt = new Student("Mathew");
        Matt.addMarks("Computer Programming", 100);
        Matt.addMarks("Mathematics", 100);
        Matt.addMarks("Computer Hacking", 99);

        if(collin.compareTo(Matt) > 0) {
            System.out.println(collin.getName() + " gets a higher total mark");
        }
        else if (collin.compareTo(Matt) < 0) {
            System.out.println(Matt.getName() + " gets a higher total marks");
        }
        else {
            System.out.println("Both students get the same total mark");
        }

    }
}
