package com.exetexe.IdeaLabProject.controller;

import com.exetexe.IdeaLabProject.service.FolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/folders")
public class FoldersController {

    private final FolderService folderService;

    @Autowired
    public FoldersController(FolderService folderService) {
        this.folderService = folderService;
    }

    @GetMapping
    public void addTest2(Long id){

        System.out.println(folderService.findNotes(id));

    }
}
