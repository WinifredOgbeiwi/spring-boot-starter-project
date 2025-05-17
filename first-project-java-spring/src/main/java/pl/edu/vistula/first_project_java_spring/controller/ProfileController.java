package pl.edu.vistula.first_project_java_spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProfileController {
    @GetMapping("/api/profile")
    public List<String> getProfile(){
        return List.of(
                "name", "Winifred Imade Ogbeiwi",
                "workplace","JP Morgan",
                "currentRole", "Computer Engineering Student",
                "school", "Vistula University",
                "goal", "To build legal tech products and mentor others",
                "hobbies","Sleeping"
        );
    }
}
