package ch.rohner.app.simplewebapp.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequestMapping("/")
@Slf4j
public class HomeController {

    @GetMapping
    public String home(Principal principal) {
        log.info("home>principal:" + principal);
        return "index";
    }
}
