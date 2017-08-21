package gramise.controller;

import gramise.domain.course.Course;
import gramise.repository.course.CourseRepository;
import gramise.repository.course.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DefaultController {

    @Autowired
    CourseRepository courseRepository;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String thymeleafTest(Model model){
        Course course = new Course();
        course.setName("Grammar course");
        course.setDescription("Jotain");
        course.setMaxPoints(100);
        courseRepository.save(course);
        model.addAttribute("course", course);
        return "default";
    }
}
