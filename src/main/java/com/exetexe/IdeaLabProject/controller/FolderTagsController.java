package com.exetexe.IdeaLabProject.controller;

import com.exetexe.IdeaLabProject.service.FolderTagService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/foldertags")
public class FolderTagsController {

    private final FolderTagService folderTagService;

    public FolderTagsController(FolderTagService folderTagService) {
        this.folderTagService = folderTagService;
    }
}
