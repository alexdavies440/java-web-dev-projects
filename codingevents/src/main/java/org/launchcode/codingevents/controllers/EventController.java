package org.launchcode.codingevents.controllers;

import jakarta.validation.Valid;
import org.launchcode.codingevents.data.EventData;
import org.launchcode.codingevents.models.Event;
import org.launchcode.codingevents.models.EventType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {

    @GetMapping
    public String displayEvents(Model model) {
        model.addAttribute("title", "All Events");
        model.addAttribute("events", EventData.getAll());
        return "events/index";
    }
    //lives at /events/create

    @GetMapping("create")
    public String renderCreateEventForm(Model model) {
        model.addAttribute("title", "Create Event");
        model.addAttribute(new Event());
        // Model attribute so types show up on Get request (page loads)
        model.addAttribute("types", EventType.values());
        return "events/create";
    }

    @PostMapping("create")
    public String createEvent(@ModelAttribute @Valid Event newEvent,
                              Errors errors, Model model) {
        if (errors.hasErrors()) {
            model.addAttribute("title", "Create Event");
            // Model attribute here seems redundant but is here in case of errors,
            // for example, there are invalid inputs, the page will reload
            // and without this, the <select> options will be blank
            model.addAttribute("types", EventType.values());

            return "events/create";
        }
        EventData.add(newEvent);
        return "redirect:/events";
    }

    @GetMapping("delete")
    public String displayDeleteEventForm(Model model) {
        model.addAttribute("title", "Delete Events");
        model.addAttribute("events", EventData.getAll());
        return "events/delete";
    }

    @PostMapping("delete")
    public String renderDeleteEventForm(@RequestParam(required = false) int[] eventIds) {
        if (eventIds != null) {
            for (int id : eventIds) {
                EventData.remove(id);
            }
        }
        return "redirect:/events";
    }

    @GetMapping("terms")
    public String displayTermsAndConditions(Model model) {
        model.addAttribute("title", "Terms and Conditions: ");
        return "events/terms";
    }
}
