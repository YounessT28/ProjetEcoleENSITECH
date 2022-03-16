package eu.ensup.controller;

import eu.ensup.domaine.Student;
import eu.ensup.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @Autowired
    private HomeService homeService;


    @GetMapping("/")
    public String home(Model model){
        /*User user = userService.findUser(new User("johndoe", "johndoe"));
        model.addAttribute("user", user);*/
        model.addAttribute("student", new Student());
        return "index";
    }

    @PostMapping("/signin")
    public String signin(Student student,Model model){
        Student fetchuser = homeService.findStudent(student);
        if(fetchuser == null){
            model.addAttribute("message", "Le mail ou le mot de passe est incorrect");
            return "index";
        }
        else
        {
            model.addAttribute("student", student);
            return "home";
        }
    }

    @GetMapping("/signup")
    public String signup(Student student,Model model){
        model.addAttribute("student", new Student());
        return "signup";
    }

    @PostMapping("/register")
    public String register(Student student, Model model){
        homeService.create(student);
        model.addAttribute("message", "Inscription réussie");
        return "index";
    }

    @GetMapping("/createstudentpage")
    public String createstudentpage(Student student,Model model){
        model.addAttribute("student", new Student());
        return "liststudent";
    }


}
