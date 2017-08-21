package gramise;

import gramise.repository.course.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Gramise {

    public static void main(String[] args) {
        SpringApplication.run(Gramise.class, args);
    }
}

