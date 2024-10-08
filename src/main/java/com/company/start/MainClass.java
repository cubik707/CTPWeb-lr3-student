package com.company.start;
import com.company.action.StudentAction;
import com.company.model.Student;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Scanner;


public class MainClass {

    StudentAction action = new StudentAction();

    public static void main(String[] args) {
        String DbOperation = "EXIT(0), ADD(1), UPDATE(2), DELETE(3), FETCHBYID(4), FETCHBYEMAIL(5), FETCHBYMOBNO(6), FETCHBYNAME(7),"
                + "FETCHBYCITY(8), FETCHBYSALRANGE(9), FETCHBYDOB(10), FETCHBYDOJRANGE(11), FETCHALL(12)";

        MainClass mainclass = new MainClass();

        int value = 0;
        do {
            System.out.println("valid operations are");

            System.out.println(DbOperation);
            System.out.println("Enter valid operation number 0-12");
            Scanner scanner = new Scanner(System.in);
            value = scanner.nextInt();

            switch (value) {
                case 1:
                    mainclass.addStudent();
                    break;
                case 2:
                    mainclass.updateStudent();
                    mainclass.fetchAllStudent();
                    break;
                case 3:
                    mainclass.deleteStudent();
                    break;
                case 4:
                    mainclass.fetchStudentById();
                    break;
                case 5:
                    mainclass.fetchStudentByEmail();
                    break;
                case 6:
                    mainclass.fetchStudentByMobileNo();
                    break;
                case 7:
                    mainclass.searchStudentByName();
                    break;
                case 8:
                    mainclass.fetchStudentByCity();
                    break;
                case 9:
                    mainclass.fetchStudentBySalaryRange();
                    break;
                case 10:
                    mainclass.fetchStudentByDob();
                    break;
                case 11:
                    mainclass.fetchStudentByDOjRange();
                    break;
                case 12:
                    mainclass.fetchAllStudent();
                    break;
                case 0:
                    System.out.println("Exiting code");
                    break;
                default:
                    System.out.println("Not a valid entry");
            }
        } while (value != 0);

    }

    public void addStudent() {
        Student student = new Student();
        Scanner insert = new Scanner(System.in);
        System.out.println("Enter First Name");
        student.setFname(insert.next());
        System.out.println("Enter Last Name");
        student.setLname(insert.next());
        System.out.println("Enter Address");
        student.setAddress(insert.next());
        System.out.println("Enter Mobile Number");
        student.setMobileNo(insert.next());
        System.out.println("Enter Mail Id");
        student.setMailId(insert.next());
        System.out.println("Enter City");
        student.setCity(insert.next());
        System.out.println("Enter Designation");
        student.setDesignation(insert.next());
        System.out.println("Enter Dob (yyyy-mm-dd)");
        student.setDob(Date.valueOf(insert.next()));
        System.out.println("Enter Doj  (yyyy-mm-dd)");
        student.setDoj(Date.valueOf(insert.next()));
        System.out.println("Enter Salary");
        student.setSalary(insert.nextBigDecimal());
        action.insert(student);
    }

    public void updateStudent() {
        Student student = new Student();
        Scanner insert = new Scanner(System.in);
        System.out.println("Enter Student Id");
        student.setId(insert.nextLong());
        System.out.println("Enter First Name");
        student.setFname(insert.next());
        System.out.println("Enter Last Name");
        student.setLname(insert.next());
        System.out.println("Enter Address");
        student.setAddress(insert.next());
        System.out.println("Enter Mobile Number");
        student.setMobileNo(insert.next());
        System.out.println("Enter Mail Id");
        student.setMailId(insert.next());
        System.out.println("Enter City");
        student.setCity(insert.next());
        System.out.println("Enter Designation");
        student.setDesignation(insert.next());
        System.out.println("Enter Dob (yyyy-mm-dd)");
        student.setDob(Date.valueOf(insert.next()));
        System.out.println("Enter Doj  (yyyy-mm-dd)");
        student.setDoj(Date.valueOf(insert.next()));
        System.out.println("Enter Salary");
        student.setSalary(insert.nextBigDecimal());
        action.update(student);
    }

    public void deleteStudent() {
        Scanner insert = new Scanner(System.in);
        System.out.println("Enter Student Id");
        long id = insert.nextLong();
        action.delete(id);
    }

    public void fetchStudentById() {
        Scanner insert = new Scanner(System.in);
        System.out.println("Enter Student Id");
        long id = insert.nextLong();
        action.fetchById(id);
    }

    public void fetchStudentByEmail() {
        Scanner insert = new Scanner(System.in);
        System.out.println("Enter Student Mail Id");
        String mailId = insert.next();
        action.fetchByEmailId(mailId);
    }

    public void fetchStudentByMobileNo() {
        Scanner insert = new Scanner(System.in);
        System.out.println("Enter Student Mobile Number");
        String mobileNo = insert.next();
        action.fetchByMobileNo(mobileNo);
    }

    public void searchStudentByName() {
        Scanner insert = new Scanner(System.in);
        System.out.println("Enter Student Name");
        String name = insert.next();
        action.searchByName(name);
    }

    public void fetchStudentByCity() {
        Scanner insert = new Scanner(System.in);
        System.out.println("Enter Student City");
        String city = insert.next();
        action.fetchByCity(city);
    }

    public void fetchStudentBySalaryRange() {
        Scanner insert = new Scanner(System.in);
        System.out.println("Enter Salary Start Range");
        BigDecimal salaryRange1 = insert.nextBigDecimal();
        System.out.println("Enter Salary End Range");
        BigDecimal salaryRange2 = insert.nextBigDecimal();

        action.fetchBySalaryRange(salaryRange1, salaryRange2);
    }

    public void fetchStudentByDob() {
        Scanner insert = new Scanner(System.in);
        System.out.println("Enter Date of Birth (yyyy-mm-dd)");
        String dob = insert.next();
        action.fetchByDob(Date.valueOf(dob));
    }

    public void fetchStudentByDOjRange() {
        Scanner insert = new Scanner(System.in);
        System.out.println("Enter Start Date of Joining (yyyy-mm-dd)");
        String dob1 = insert.next();
        System.out.println("Enter End Date of Joining (yyyy-mm-dd)");
        String dob2 = insert.next();
        action.fetchByRangeDoj(Date.valueOf(dob1), Date.valueOf(dob2));
    }

    public void fetchAllStudent() {
        action.fetchAll();
    }

}

