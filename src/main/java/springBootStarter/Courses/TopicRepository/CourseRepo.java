package springBootStarter.Courses.TopicRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import springBootStarter.Courses.Entities.Course;

import java.util.List;

@Repository
public interface CourseRepo extends CrudRepository<Course, String> {
    List<Course> findCoursesByTopicId(String topicId);
}
