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
            System.out.println("Course Inserted Successfully");
        } else if (status == -1) {
            System.out.println("Course Already exists");
        } else {
            System.out.println("Unable to Insert Course");
        }
    }

    public void update(Course course) {
        status = dao.update(course);
        if (status == 1) {
            System.out.println("Course Updated Successfully");
        } else {
            System.out.println("Unable to update Course");
        }
    }
}
