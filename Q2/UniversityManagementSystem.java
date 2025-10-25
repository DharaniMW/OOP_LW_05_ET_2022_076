package Q2;

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Department department1 = new Department("Applied Computing");

        Degree degree1 = new Degree("Engineering Technology", 0);

        Course course1 = new Course("Objected-Oriented programming", "Full-time", 0);
        Course course2 = new Course("Applied Calculus", "Full-time", 0);

        Lecturer lecturer1 = new Lecturer("Dr.perera", "Professor");
        Lecturer lecturer2 = new Lecturer(" Dr.Smith", "Associate professor");

        Student student1 = new Student("John", "ET2022123", "Second Year");
        Student student2 = new Student("Alex", "ET2022456", "Second year");

        department1.appointDepartmentHead(lecturer1);
        department1.addLecturer(lecturer1);
        department1.addLecturer(lecturer2);
        department1.offerCourse(course1);
        department1.offerCourse(course2);

        degree1.offerCourse(course1);
        degree1.offerCourse(course2);

        course1.addLecturerInCharge(lecturer1);
        course2.addLecturerInCharge(lecturer2);

        student1.registerDegree(degree1);
        student2.registerDegree(degree1);

        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course1);
        student2.enrollCourse(course2);

        System.out.println("==== UNIVERSITY MANAGEMENT SYSTEM ====");
        System.out.println();

        System.out.println("---- Department Information ----");
        department1.displayInfo();
        System.out.println();

        System.out.println("---- Department head Information ----");
        department1.displayDepartmentHeadInfo();
        System.out.println();

        System.out.println("---- Degree Information ----");
        degree1.displayInfo();
        System.out.println();

        System.out.println("---- Lecturer Information ----");
        lecturer1.displayInfo();
        System.out.println();
        lecturer2.displayInfo();
        System.out.println();

        System.out.println("---- Student Information ----");
        student1.displayInfo();
        System.out.println();
        student2.displayInfo();
        System.out.println();

        System.out.println("---- Course Information ----");
        course1.displayInfo();
        System.out.println();
        course2.displayInfo();
        System.out.println();

        System.out.println("---- Courses in Engineering technology degree ----");
        degree1.listCoursesOffering();
        System.out.println();

        System.out.println("---- Courses taught by Dr.Perera ----");
        lecturer1.listCoursesTeaching();
        System.out.println();

        System.out.println("---- Courses taught by Dr.Smith ----");
        lecturer2.listCoursesTeaching();
        System.out.println();

    }
}
