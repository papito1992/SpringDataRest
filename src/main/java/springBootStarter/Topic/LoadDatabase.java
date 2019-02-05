package springBootStarter.Topic;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springBootStarter.Topic.Entities.Topic;
import springBootStarter.Topic.TopicRepository.TopicRepo;


@Configuration
@Slf4j
public class LoadDatabase {

    @Bean
    CommandLineRunner initDatab(TopicRepo repository) {
        return args -> {

            log.info("Preloading " + repository.save(new Topic("a", "good quality for a low price", "Latitude: 68.24242, Longitude: -144.71742, Distortion: 7.28")));

            log.info("Preloading " + repository.save(new Topic("c", "Proce","Latitude: -28.50547, Longitude: 140.96112, Distortion: 1.29")));

            log.info("Preloading " + repository.save(new Topic("b",  "Gedimino g", "Latitude: -78.37753, Longitude: -55.66267, Distortion: 24.64")));

        };
    }
}
