package springBootStarter.Topic.TopicRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import springBootStarter.Topic.Entities.Topic;


@Repository
public interface TopicRepo extends CrudRepository<Topic, String> {

   }
