package com.Springboot.CourseRegistrationApp.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data

@Entity
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int CourseId;
    private String CourseName;
    private int DurationInWeeks;
    private String Trainer;

    public void setCourseId(int courseId) {
        CourseId = courseId;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public void setDurationInWeeks(int durationInWeeks) {
        DurationInWeeks = durationInWeeks;
    }

    public void setTrainer(String trainer) {
        Trainer = trainer;
    }


    public int getCourseId() {
        return CourseId;
    }

    public String getCourseName() {
        return CourseName;
    }

    public int getDurationInWeeks() {
        return DurationInWeeks;
    }

    public String getTrainer() {
        return Trainer;
    }
    @Override
    public String toString() {
        return "Course{" +
                "CourseId=" + CourseId +
                ", CourseName='" + CourseName + '\'' +
                ", DurationInWeeks=" + DurationInWeeks +
                ", Trainer='" + Trainer + '\'' +
                '}';
    }
}
