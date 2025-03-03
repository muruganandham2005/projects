package com.Springboot.CourseRegistrationApp.Service;

import com.Springboot.CourseRegistrationApp.Model.Course;
import com.Springboot.CourseRegistrationApp.Model.CourseRegistry;
import com.Springboot.CourseRegistrationApp.Repository.CourseRegistryRepo;
import com.Springboot.CourseRegistrationApp.Repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepo courseRepo;
    @Autowired
    CourseRegistryRepo courseRegistryRepo;
    public List<Course> AvilableCourses() {
        return courseRepo.findAll();

    }

    public List<CourseRegistry> EnrolledStudents() {
        return courseRegistryRepo.findAll();

    }

    public void RegisteredCourse(String Name, String EmailId, String CourseName) {
        CourseRegistry courseRegistry = new CourseRegistry(Name,EmailId,CourseName);
        courseRegistryRepo.save(courseRegistry);
    }
}
