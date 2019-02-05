package springBootStarter.Topic.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springBootStarter.Topic.Entities.Topic;
import springBootStarter.Topic.Services.TopicService;


import java.util.List;
import java.util.Optional;

@RestController
public class TopicController {
    @Autowired
    private TopicService topicService;

    @GetMapping("/topics")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    @PostMapping("/topics")
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }

    @GetMapping("/topics/{id}")
    public Optional<Topic> getTopicById(@PathVariable String id) {
        return topicService.getById(id);
    }

    @PutMapping("/topics/{id}")
    public void updateTopic(@PathVariable String id, @RequestBody Topic topic) {
        topicService.updateTopicById(topic);
    }

    @DeleteMapping("/topics/{id}")
    public void deleteTopic(@PathVariable String id) {
        topicService.deleteTopic(id);
    }

}
