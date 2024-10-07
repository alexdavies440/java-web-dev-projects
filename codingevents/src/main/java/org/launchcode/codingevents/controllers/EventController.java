package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {


    HashMap<String, String> events = new HashMap();

    @GetMapping
    public String displayEvents(Model model) {
        model.addAttribute("events", events);

        events.put("Java Day", "Learn the entirety of Java in one day while drinking nothing but java");
        events.put("The Great Escape", "Learn to use a state setter to call for help to get out of an escape room before the timer runs out!");
        events.put("The Spanish Inquisition", "Practice coding interviews");
        return "events/index";
    }
    //lives at /events/create
@GetMapping("create")
public String renderCreateEventForm() {
        return "events/create";
}

@PostMapping("create")
public String createEvent(@RequestParam String eventName) {



    // Redirects to root of this controller
        return "redirect:/events";
}
}
