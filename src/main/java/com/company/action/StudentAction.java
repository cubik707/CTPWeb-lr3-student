package com.company.action;

import com.company.dao.StudentDao;
import com.company.model.Student;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;


public class StudentAction {

    StudentDao dao = new StudentDao();
    int st;

    public void insert(Student student) {
        st = dao.insert(student);
        if (st == 1) {
            System.out.println("Student Inserted Successfully");
        } else if (st == -1) {
            System.out.println("Student Already exists");
        } else {
            System.out.println("Unable to Insert Student");
        }
    }

    public void update(Student student) {
        st = dao.update(student);
        if (st == 1) {
            System.out.println("Student Updated Successfully");
        } else {
            System.out.println("Unable to update Student");
        }
    }

    public void delete(Long id) {
        st = dao.delete(id);
        if (st == 1) {
            System.out.println("Student Deleted Successfully");
        } else {
            System.out.println("No Record Found");
        }
    }

    public void fetchById(Long id) {
        Student student = dao.fetchById(id);
        if (student.getId() == 0) {
            System.out.println("No Record Found");
        } else {
            System.out.println("Student Details are :");
            System.out.println(student);
        }
    }

    public void fetchByEmailId(String emailId) {
        Student student = dao.fetchByEmailId(emailId);
        if (student.getId() == 0) {
            System.out.println("No Record Found");
        } else {
            System.out.println("Student Details are :");
            System.out.println(student);
        }
    }

    public void fetchByMobileNo(String mobileNo) {
        Student student = dao.fetchByMobileNo(mobileNo);
        if (student.getId() == 0) {
            System.out.println("No Record Found");
        } else {
            System.out.println("Student Details are :");
            System.out.println(student);
        }
    }

    public void searchByName(String name) {
        List<Student> studentList = dao.searchByName(name);
        if (studentList.isEmpty()) {
            System.out.println("No Record Found");
        } else {
            System.out.println("Student Details are :");
            for (Student student : studentList) {
                System.out.println(student);
            }
        }

    }

    public void fetchByCity(String city) {
        List<Student> studentList = dao.fetchByCity(city);
        if (studentList.isEmpty()) {
            System.out.println("No Record Found");
        } else {
            System.out.println("Student Details are :");
            for (Student student : studentList) {
                System.out.println(student);
            }
        }
    }

    public void fetchBySalaryRange(BigDecimal lowerSalary, BigDecimal higherSalary) {
        List<Student> studentList = dao.fetchBySalaryRange(lowerSalary, higherSalary);
        if (studentList.isEmpty()) {
            System.out.println("No Record Found");
        } else {
            System.out.println("Student Details are :");
            for (Student student : studentList) {
                System.out.println(student);
            }
        }
    }

    public void fetchByDob(Date dob) {
        List<Student> studentList = dao.fetchByDob(dob);
        if (studentList.isEmpty()) {
            System.out.println("No Record Found");
        } else {
            System.out.println("Student Details are :");
            for (Student student : studentList) {
                System.out.println(student);
            }
        }
    }

    public void fetchByRangeDoj(Date startDate, Date endDate) {
        List<Student> studentList = dao.fetchByRangeDoj(startDate, endDate);
        if (studentList.isEmpty()) {
            System.out.println("No Record Found");
        } else {
            System.out.println("Student Details are :");
            for (Student student : studentList) {
                System.out.println(student);
            }
        }
    }

    public void fetchAll() {
        List<Student> studentList = dao.fetchAll();
        if (studentList.isEmpty()) {
            System.out.println("No Record Found");
        } else {
            System.out.println("Student Details are :");
            for (Student student : studentList) {
                System.out.println(student);
            }
        }
    }

}

