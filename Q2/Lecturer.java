package Q2;

import java.util.ArrayList;

public class Lecturer extends Person {
    private String position;
    private Department department;
    private ArrayList<Course> coursesTeaching;

    public Lecturer(String name, String position) {
        super(name);
        this.position = position;
        this.coursesTeaching = new ArrayList<>();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void displayDepartmentInfo() {
        if (department != null) {
            department.displayInfo();
        } else {
            System.out.println("Not assigned to any department.");
        }
    }

    public void addCourse(Course course) {
        coursesTeaching.add(course);
    }

    public void removeCourse(Course course) {
        coursesTeaching.remove(course);
    }
    public void listCoursesTeaching() {
        System.out.println("courses taught by " +getName()+ ":");

        for (Course course: coursesTeaching) {
            course.displayInfo();
        }
    }

    public void displayInfo() {
        System.out.println("Lecturer: " +getName());
        System.out.println("Position: " +position);

        if (department != null) {
            System.out.println("Department: " +department.getName());
        }
        System.out.println("Courses Teaching: " +coursesTeaching.size());
    }
}
