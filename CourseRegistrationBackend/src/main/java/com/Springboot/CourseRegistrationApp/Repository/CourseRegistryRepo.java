package com.Springboot.CourseRegistrationApp.Repository;

import com.Springboot.CourseRegistrationApp.Model.CourseRegistry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRegistryRepo extends JpaRepository<CourseRegistry,Integer> {
}
