package Q2;

import java.util.ArrayList;

public class Degree {
    private String name;
    private int numberOfStudent;
    private ArrayList<Course> coursesOffering;

    public Degree(String name, int numberOfStudent) {
        this.name = name;
        this.numberOfStudent = numberOfStudent;
        this.coursesOffering = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }

    public void displayInfo() {
        System.out.println("Degree: " +name);
        System.out.println("Number of students: " +numberOfStudent);
        System.out.println("Courses Offered: " +coursesOffering.size());
    }

    public void offerCourse(Course course) {
        coursesOffering.add(course);
        course.addDegreeBelongsTo(this);
    }
    public void withdrawCourse(Course course) {
        coursesOffering.remove(course);
        course.removeDegreeBelongsTo();
    }
    public void listCoursesOffering() {
        System.out.println("Courses offered in " +name+ "degree: ");

        for (Course course: coursesOffering) {
            course.displayInfo();
        }
    }
}
