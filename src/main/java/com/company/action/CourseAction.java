package com.company.action;

import com.company.dao.CourseDao;
import com.company.dao.StudentDao;
import com.company.model.Course;
import com.company.model.Student;

public class CourseAction {
    CourseDao dao = new CourseDao();
    int status;

    public void insert(Course course) {
        status = dao.insert(course);
        if (status == 1) {
            System.out.println("Student Inserted Successfully");
        } else if (status == -1) {
            System.out.println("Student Already exists");
        } else {
            System.out.println("Unable to Insert Student");
        }
    }
}
