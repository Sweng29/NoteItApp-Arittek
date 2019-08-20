package com.noteit.app.demo.controllers;

import com.noteit.app.demo.models.Note;
import com.noteit.app.demo.services.NoteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NoteController {

    private NoteService noteService;

    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @RequestMapping(value = "notes", method = RequestMethod.GET)
    public ModelAndView save(@ModelAttribute(name = "note") Note note) {
        ModelAndView modelAndView = new ModelAndView("notes");
        return modelAndView;
    }

    @RequestMapping(value = "create-notes")
    public ModelAndView notesHome() {
        ModelAndView modelAndView = new ModelAndView("notes");
        return modelAndView;
    }


}
