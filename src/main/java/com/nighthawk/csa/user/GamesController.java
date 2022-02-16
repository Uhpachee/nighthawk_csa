package com.nighthawk.csa.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.ui.Model;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class GamesController {

    @Autowired private GameService service;

    @GetMapping("/data")
    public String ShowGamelist(Model model)
    {
    List<Games> listUsers=service.listAll();
    model.addAttribute("listUsers", listUsers);
    return "data";
    }


    @GetMapping("/newt")

        public String ShowNewForm(Model model)
        {
            model.addAttribute("games", new Games());
            model.addAttribute("pageTitle", "Add New Game");
            return "new";
        }

    @PostMapping("/save")

        public String saveGame(@ModelAttribute("games") Games games, RedirectAttributes ra)
        {
            service.save(games);
            ra.addFlashAttribute("message", "The game has been added successfully");
            return "redirect:/data";
        }

    @GetMapping("/edit/{Id}")

        public String showEditForm(@PathVariable("Id") Integer Id, Model model, RedirectAttributes ra) {
        try {
            Games games = service.get(Id);
            model.addAttribute("games", games);
            model.addAttribute("pageTitle", "Edit Game(Id: "+ Id+ ")");
            return "/new";

        } catch (UserNotFoundException e) {
            ra.addFlashAttribute("message", e.getMessage());
            return "redirect:/data";
        }
    }
    @GetMapping("/delete/{Id}")
    public String gameDelete(@PathVariable("Id") Integer Id) {
        service.delete(Id);
        return "redirect:/data";
    }




}

