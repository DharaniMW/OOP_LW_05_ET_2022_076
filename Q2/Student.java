package Q2;

import java.util.ArrayList;

public class Student extends Person{

    private String studentID;
    private String year;
    private Degree degree;
    private ArrayList<Course> coursesEnrolled;

    public Student(String name, String studentID, String year) {
        super(name);
        this.studentID = studentID;
        this.year = year;
        this.coursesEnrolled = new ArrayList<>();
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void registerDegree(Degree degree) {
        this.degree = degree;
        degree.setNumberOfStudent(degree.getNumberOfStudent() + 1);
    }
    public void displayDegreeInfo() {
        if (degree != null) {
            degree.displayInfo();
        } else {
            System.out.println("Not registered for any degree.");
        }
    }
    public void enrollCourse(Course course) {
        coursesEnrolled.add(course);
        course.setNumberOfStudentsEnrolled(course.getNumberOfStudentsEnrolled() + 1);
    }
    public void unenrollCourse(Course course) {
        coursesEnrolled.remove(course);
        course.setNumberOfStudentsEnrolled(course.getNumberOfStudentsEnrolled() - 1);
    }
    public void listCoursesEnrolled() {
        System.out.println("Courses enrolled by " + getName() + ":");

        for (Course course: coursesEnrolled) {
            course.displayInfo();
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Student: " +getName());
        System.out.println("student ID: " +studentID);
        System.out.println("Year: " +year);

        if (degree != null) {
            System.out.println("Degree: " +degree.getName());
        }
        System.out.println("Courses Enrolled: " +coursesEnrolled.size());
    }
}
