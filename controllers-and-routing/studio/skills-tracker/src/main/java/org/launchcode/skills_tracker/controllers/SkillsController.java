package org.launchcode.skills_tracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
                "<button type = 'submit' name='toForm'>Click Here</button>" +
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
                "<select name='firstChoice'>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='react'>React</option>" +
                "</select>" +
                "<br>" +
                "<label>My second favourite language: </label>" +
                "<br>" +
                "<select name='secondChoice'>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='react'>React</option>" +
                "</select>" +
                "<br>" +
                "<label>My third favourite language: </label>" +
                "<br>" +
                "<select name='thirdChoice'>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='react'>React</option>" +
                "</select>" +
                "<br>" +
                "<input type='submit' value='submit'/>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("/form")
    public String submitForm(@RequestParam String name, @RequestParam String firstChoice, @RequestParam String secondChoice, @RequestParam String thirdChoice) {
        return "<html>" +
                "<body style='color: chartreuse; background-color: black;'>" +
                "<h1 style='text-shadow: 0 0 12px blue;'>" + name + "</h1>" +
                "<table style='font-size: 2.5em; border: 3px solid; padding: 8px; text-shadow: 0 0 12px blue;'>" +
                "<tr>" + "<td style='text-align: left;'>First choice: </td>" + "<td>" + firstChoice + "</td>" + "</tr>" +
                "<tr>" + "<td style='text-align: left;'>Second choice: </td>" + "<td>" + secondChoice + "</td>" + "</tr>" +
                "<tr>" + "<td style='text-align: left;'>Third choice: </td>" + "<td>" + thirdChoice + "</td>" + "</tr>" +                "</table>" +
                "</body>" +
                "</html>";

    }

}
