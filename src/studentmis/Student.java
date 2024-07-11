package studentmis;

import java.util.Scanner;

public class Student {

    private String firstname;
    private String lastname;
    private int gradeYear;
    private int studentID;
    private String courses;
    private int tuitionBalance;
    private int costOfCourse = 600;



    //Constructor: prompt user to enter student's name and year

    public Student(){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter First Name: ");
        this.firstname = in.nextLine();

        System.out.println("Enter Last Name: ");
        this.lastname = in.nextLine();

        System.out.println("1 - Sophomore\n 2 - Freshman\n 3 - Junior\n 4 - Senior\n Enter grade level: ");
        this.gradeYear = in.nextInt();

        System.out.println(firstname + " " + lastname + ": " + gradeYear);
    }

    //Generate an ID

    //Enroll in courses

    //View Balance

    //Pay tuition

    //show status
}
