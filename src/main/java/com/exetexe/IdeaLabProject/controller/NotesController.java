package com.exetexe.IdeaLabProject.controller;


import com.exetexe.IdeaLabProject.entity.Note;
import com.exetexe.IdeaLabProject.service.NoteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/notes")
public class NotesController {

    private final NoteService noteService;

    public NotesController(NoteService noteService) {
        this.noteService = noteService;
    }

    @ResponseBody
    @GetMapping
    public List<Note> getNotes() {


        List<Note> result = noteService.findAll();

        List<Note> testList = new ArrayList<>();

        for (Note note : result) {
            System.out.println(note.getFolders());
            System.out.println(note.getFolderTags());


        }

        Note note = new Note();
        note.setText("tytytyty");

        testList.add(note);

//        return noteService.findAll();
        return result;
    }
}
