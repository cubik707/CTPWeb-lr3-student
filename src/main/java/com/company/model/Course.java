package com.company.model;

import java.sql.Timestamp;
import java.sql.Date;

public class Course {
    private long id;
    private String courseName;
    private String teacher;
    private Date startDate;
    private Date endDate;
    private Timestamp addDate;

    // Constructor
    public Course(long id, String courseName, String teacher, Date startDate, Date endDate, Timestamp addDate) {
        this.id = id;
        this.courseName = courseName;
        this.teacher = teacher;
        this.startDate = startDate;
        this.endDate = endDate;
        this.addDate = addDate;
    }

    // Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Timestamp getAddDate() {
        return addDate;
    }

    public void setAddDate(Timestamp addDate) {
        this.addDate = addDate;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", teacher='" + teacher + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", addDate=" + addDate +
                '}';
    }
}

