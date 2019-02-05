package springBootStarter.Topic.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springBootStarter.Topic.Entities.Topic;
import springBootStarter.Topic.TopicRepository.TopicRepo;

import java.util.List;
import java.util.Optional;

@Service
public class TopicService {
    @Autowired
    private TopicRepo topicRepo;


    public List<Topic> getAllTopics() {
        return (List<Topic>) topicRepo.findAll();
    }

    public void addTopic(Topic topic) {
        topicRepo.save(topic);
    }

    public Optional<Topic> getById(String id) {
        return topicRepo.findById(id);
    }

    public void updateTopicById(Topic topic) {
        topicRepo.save(topic);
    }

    public void deleteTopic(String id) {
        topicRepo.deleteById(id);
    }
}
