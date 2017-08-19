package gramise.controller;

import gramise.domain.course.Course;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DefaultController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String thymeleafTest(Model model){
        System.out.println("home");
        Course course = new Course();
        course.setName("Grammar course");
        model.addAttribute("course", course);
        return "default";
    }
}
