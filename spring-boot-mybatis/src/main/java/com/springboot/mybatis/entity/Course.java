package com.springboot.mybatis.entity;

public class Course {
    private Long courseId;
    private String courseName;
    private Long userId;
    private String courseClass;
    private String cover;
    private String courseCode;
    private Short finished;

    public Course() {
    }

    public Course(Long courseId, String courseName, Long userId, String courseClass, String cover, String courseCode, Short finished) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.userId = userId;
        this.courseClass = courseClass;
        this.cover = cover;
        this.courseCode = courseCode;
        this.finished = finished;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getCourseClass() {
        return courseClass;
    }

    public void setCourseClass(String courseClass) {
        this.courseClass = courseClass;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Short getFinished() {
        return finished;
    }

    public void setFinished(Short finished) {
        this.finished = finished;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", userId=" + userId +
                ", courseClass='" + courseClass + '\'' +
                ", cover='" + cover + '\'' +
                ", courseCode='" + courseCode + '\'' +
                ", finished=" + finished +
                '}';
    }
}
