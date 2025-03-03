package com.Springboot.CourseRegistrationApp.Model;

import jakarta.persistence.*;


@Entity
@Table(name = "course_registry")
public class CourseRegistry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int RegisterId;
    private String Name;

    public CourseRegistry(String name, String emailId, String courseName) {
        Name = name;
        EmailId = emailId;
        CourseName = courseName;
    }
    public CourseRegistry(){

    }

    private String EmailId;
    private String CourseName;
    public void setRegisterId(int registerId) {
        RegisterId = registerId;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setEmailId(String emailId) {
        EmailId = emailId;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public int getRegisterId() {
        return RegisterId;
    }

    public String getName() {
        return Name;
    }

    public String getEmailId() {
        return EmailId;
    }

    public String getCourseName() {
        return CourseName;
    }
    @Override
    public String toString() {
        return "CourseRegistry{" +
                "RegisterId=" + RegisterId +
                ", Name='" + Name + '\'' +
                ", EmailId='" + EmailId + '\'' +
                ", CourseName='" + CourseName + '\'' +
                '}';
    }


}
