package com.bootstrapwithspringboot.webapp.contoller;

import com.bootstrapwithspringboot.webapp.domain.Notes;
import com.bootstrapwithspringboot.webapp.service.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Optional;

/**
 * Created by abraun on 10/11/2017.
 */
@Controller
public class NotesController {

    @Autowired
    NotesService notesService;

    @RequestMapping(value="/notes")
    public String notesList(Model model) {
        model.addAttribute("notesList", notesService.findAll());
        return "notesList";
    }

    @RequestMapping(value={"/notesEdit","/notesEdit/{id}"}, method = RequestMethod.GET)
    public String notesEditForm(Model model, @PathVariable(required = false, name = "id") Long id) {
        if (null != id) {
            Optional<Notes> optionalNote = notesService.findOne(id);
            if (optionalNote.isPresent()) {
                model.addAttribute("notes", optionalNote.get());
            } else {
                Notes note = new Notes();
                note.setContent("It did not find note for id=" + id);
                model.addAttribute("notes", note);
            }
        } else {
            model.addAttribute("notes", new Notes());
        }
        return "notesEdit";
    }

    @RequestMapping(value="/notesEdit", method = RequestMethod.POST)
    public String notesEdit(Model model, Notes notes) {
        notesService.saveNotes(notes);
        model.addAttribute("notesList", notesService.findAll());
        return "notesList";
    }

    @RequestMapping(value="/notesDelete/{id}", method = RequestMethod.GET)
    public String notesDelete(Model model, @PathVariable(required = true, name = "id") Long id) {
        notesService.deleteNotes(id);
        model.addAttribute("notesList", notesService.findAll());
        return "notesList";
    }
}
