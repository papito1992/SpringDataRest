package springBootStarter.Courses.Entities;

import springBootStarter.Topic.Entities.Topic;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Course {
    @Id
    private String id;
    private String name;
    private String description;

    @ManyToOne
    private Topic topic;

    public Course(String id, String name, String description) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.topic = new Topic("topicId","", "");
    }

    public Course() {
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
