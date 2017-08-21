package gramise.controller;

import gramise.domain.course.Exercise;
import gramise.repository.course.CourseRepository;
import gramise.repository.course.ExerciseRepository;
import gramise.repository.course.WordRepository;
import gramise.repository.user.ProfilePictureRepository;
import gramise.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by karlin on 21/08/2017.
 */

@Controller
public class TestingController {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    ExerciseRepository exerciseRepository;

    @Autowired
    WordRepository wordRepository;

    @Autowired
    ProfilePictureRepository profilePictureRepository;

    @RequestMapping(value = "/testing/flushdatabase", method = RequestMethod.GET)
    public String flush(Model model){
        int entries = profilePictureRepository.findAll().size() +
                      wordRepository.findAll().size() +
                      exerciseRepository.findAll().size() +
                      userRepository.findAll().size() +
                      courseRepository.findAll().size();


        profilePictureRepository.deleteAll();
        exerciseRepository.deleteAll();
        wordRepository.deleteAll();
        courseRepository.deleteAll();
        userRepository.deleteAll();

        model.addAttribute("entries", entries + " entries removed.");
        return "flush";
    }
}
