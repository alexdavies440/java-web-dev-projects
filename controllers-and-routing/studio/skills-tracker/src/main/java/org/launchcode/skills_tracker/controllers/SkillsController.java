package org.launchcode.skills_tracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {
    @GetMapping()
    public String homePage() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>Three skills I want to work on: </h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>React</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }
    @GetMapping("/form")
    public String form() {
        return "<html>" +
                "<body>" +
                "<form action='form' method='post'>" +
                "<label>Name: </label>" +
                "<br>" +
                "<input type='text' name='name'/>" +
                "<br>" +
                "<label>My favourite language: </label>" +
                "<br>" +
                "<select>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='react'>React</option>" +
                "</select>" +
                "<br>" +
                "<label>My second favourite language: </label>" +
                "<br>" +
                "<select>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='react'>React</option>" +
                "</select>" +
                "<br>" +
                "<label>My third favourite language: </label>" +
                "<br>" +
                "<select>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='react'>React</option>" +
                "</select>" +
                "<br>" +
                "<input type='submit' value='submit'/>" +
                "</body>" +
                "</html>";
    }

}
