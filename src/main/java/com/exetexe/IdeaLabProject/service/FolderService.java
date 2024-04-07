package com.exetexe.IdeaLabProject.service;

import com.exetexe.IdeaLabProject.entity.Folder;
import com.exetexe.IdeaLabProject.entity.FolderTag;
import com.exetexe.IdeaLabProject.entity.Note;
import com.exetexe.IdeaLabProject.repository.FolderRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class FolderService {
    
    private final FolderRepository folderRepository;

    @Autowired
    public FolderService(FolderRepository folderRepository) {
        this.folderRepository = folderRepository;
    }

    public List<Folder> findAll(){

        return folderRepository.findAll();
    }

    public Folder findOne(Long id){
        Optional<Folder> foundFolder =  folderRepository.findById(id);

        return foundFolder.orElse(null);
    }

    public void save(Folder Folder){
        folderRepository.save(Folder);
    }

    public void update (Long id, Folder updatedFolder){

        updatedFolder.setId(id);
        folderRepository.save(updatedFolder);
    }

    public void delete(Long id){

        folderRepository.deleteById(id);
    }

    public List<Note> findNotes(Long id) {

        Folder folder = findOne(id);

        return folder == null ? null : folder.getNotes();
    }

    public List<FolderTag> findFolderTags(Long id) {

        Folder folder = findOne(id);

        return folder == null ? null : folder.getFolderTags();
    }
    
    
}
