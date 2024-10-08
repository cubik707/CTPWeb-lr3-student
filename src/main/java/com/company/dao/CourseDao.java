package com.company.dao;

import com.company.model.Course;
import com.company.model.Student;

import java.sql.*;

public class CourseDao {
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    int status;

    public int insert(Course course) {
        con = ConnectionFactory.getConnection();
        try {
            String query = "insert into course(course_name, teacher, start_date, end_date) "
                    + "values(?,?,?,?)";
            ps = con.prepareStatement(query);
            ps.setString(1, course.getCourseName());
            ps.setString(2, course.getTeacher());
            ps.setDate(3, course.getStartDate());
            ps.setDate(4, course.getEndDate());
            status = ps.executeUpdate();
            System.out.println("inserted course " + status);
        } catch (SQLIntegrityConstraintViolationException e) {
            status = -1;
            e.printStackTrace();
        } catch (Exception e) {
            status = -2;
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return status;
    }
}
