package studentmis;

import java.util.Scanner;

public class Student {

    private String firstname;
    private String lastname;
    private int gradeYear;
    private String studentID;
    private String courses;
    private int tuitionBalance;
    private static int costOfCourse = 600;
    private static int id = 1000;



    //Constructor: prompt user to enter student's name and year

    public Student(){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter First Name: ");
        this.firstname = in.nextLine();

        System.out.println("Enter Last Name: ");
        this.lastname = in.nextLine();

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

    //View Balance

    //Pay tuition

    //show status
}
