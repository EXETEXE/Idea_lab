package com.exetexe.IdeaLabProject.controller;

import com.exetexe.IdeaLabProject.entity.Note;
import com.exetexe.IdeaLabProject.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {

    public final NoteService noteService;

    @Autowired
    public TestController(NoteService noteService) {
        this.noteService = noteService;
    }

    @GetMapping()
    public void addTest(){
        Note note = new Note();

        note.setText("dgdgdgasdgadghadghadgh");
        noteService.save(note);
    }

    @PostMapping
    @RequestMapping("/postnote")
    public void addTest2(@RequestBody Note note){

        System.out.println();
        System.out.println(note.getClass());


        System.out.println("Post test 1");
        System.out.println(note);

        noteService.save(note);
    }


}
