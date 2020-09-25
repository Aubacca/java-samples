package ch.rohner.app.simplewebapp.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/profile")
@Slf4j
public class ProfileController {

    @GetMapping
    public String profile() {
        log.info("profile><");
        return "profile/profile";
    }
}
