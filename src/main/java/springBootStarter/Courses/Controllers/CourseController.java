package springBootStarter.Courses.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springBootStarter.Courses.Entities.Course;
import springBootStarter.Courses.Services.CourseService;
import springBootStarter.Topic.Entities.Topic;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/topics/{id}/courses")
    public List<Course> getAllCourses(@PathVariable String id) {
        return courseService.getAllCourses(id);
    }

    @GetMapping("/topics/{topicId}/courses/{id}")
    public Optional<Course> getCourseById(@PathVariable String id) {
        return courseService.getCourseById(id);
    }
    @PostMapping("/topics/{topicId}/courses")
    public void addCourse(@RequestBody Course course,@PathVariable String topicId) {
        course.setTopic(new Topic(topicId,"",""));
        courseService.addCourse(course);
    }
    @PutMapping("/topics/{topicId}/courses/{id}")
    public void updateCourse(@PathVariable String id, @PathVariable String topicId, @RequestBody Course course) {
        course.setTopic(new Topic(topicId,"",""));
        courseService.updateCourse(course);
    }
    @DeleteMapping("/topics/{topicId}/courses/{id}")
    public void deleteCourse(@PathVariable String id) {
        courseService.deleteCourse(id);
    }

}
