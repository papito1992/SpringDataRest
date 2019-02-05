package springBootStarter.Courses.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springBootStarter.Courses.Entities.Course;
import springBootStarter.Courses.TopicRepository.CourseRepo;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    @Autowired
    private CourseRepo courseRepo;


    public List<Course> getAllCourses(String id) {
        return courseRepo.findCoursesByTopicId(id);
    }

    public void addCourse(Course course) {
        courseRepo.save(course);
    }

    public Optional<Course> getCourseById(String id) {
        return courseRepo.findById(id);
    }

    public void updateCourse(Course course) {
        courseRepo.save(course);
    }

    public void deleteCourse(String id) {
        courseRepo.deleteById(id);
    }
}
