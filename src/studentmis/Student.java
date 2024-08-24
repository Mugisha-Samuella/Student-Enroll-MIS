package studentmis;

import java.util.Scanner;

public class Student {

    private final String lastname;
    private final String firstname;
    private final int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int id = 1000;



    //Constructor: prompt user to enter student's name and year

    public Student(){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter First Name: ");
        firstname = in.nextLine();

        System.out.println("Enter Last Name: ");
        lastname = in.nextLine();

        System.out.println("1 - Sophomore\n 2 - Freshman\n 3 - Junior\n 4 - Senior\n Enter grade level: ");
        this.gradeYear = in.nextInt();

        setStudentID();

        System.out.println(firstname + " " + lastname + " " + gradeYear + " " + studentID);
    }

    //Generate an ID
    private void setStudentID(){
        id++;
        this.studentID = gradeYear + "" + id;
    }

    //Enroll in courses
    public void EnrollStudent(){
        //Get inside a loop, user hits 0
        System.out.println("Enter courses (Press Q to exit))");
        do {
            System.out.print("Course: ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();

            if (!course.equals("Q")) {
                this.courses = courses + " " + course;
                int costOfCourse = 600;
                this.tuitionBalance += costOfCourse;
            } else {
                break;
            }
        } while (true);

        System.out.println("Names: " + firstname + " " + lastname + "\n" + "Grade: " + gradeYear + "\n" + "Student Id: " + studentID);
        System.out.println("Enrolled in: " + courses);
        System.out.println("Tuition Balance: " + tuitionBalance);
    }

    //View Balance

    //Pay tuition

    //show status
}
