package com.Springboot.CourseRegistrationApp.Controller;

import com.Springboot.CourseRegistrationApp.Model.Course;
import com.Springboot.CourseRegistrationApp.Model.CourseRegistry;
import com.Springboot.CourseRegistrationApp.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class CourseController {
    @Autowired
    CourseService courseService;
    @GetMapping("courses")
    public List<Course> AvailableCourses(){
        return courseService.AvilableCourses();

    }
    @GetMapping("courses/enrolled")
    public List<CourseRegistry>EnrolledStudents(){
        return courseService.EnrolledStudents();

    }
    @PostMapping("/courses/register")
    public String RegisteredCourse(@RequestParam("Name")String Name,
                                 @RequestParam("EmailId")String EmailId,
                                 @RequestParam("CourseName") String CourseName){
        courseService.RegisteredCourse(Name,EmailId,CourseName);
        return "Congratulation! "+Name+ " Course Registered For "+CourseName+" Done Successfully";

    }
}
