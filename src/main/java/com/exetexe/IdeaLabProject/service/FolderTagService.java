package com.exetexe.IdeaLabProject.service;

import com.exetexe.IdeaLabProject.entity.FolderTag;
import com.exetexe.IdeaLabProject.repository.FolderTagRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class FolderTagService {
    
    private final FolderTagRepository folderTagRepository;
    
    @Autowired
    public FolderTagService(FolderTagRepository folderTagRepository) {
        this.folderTagRepository = folderTagRepository;
    }

    public List<FolderTag> findAll(){

        return folderTagRepository.findAll();
    }

    public FolderTag findOne(Long id){
        Optional<FolderTag> foundFolderTag =  folderTagRepository.findById(id);

        return foundFolderTag.orElse(null);
    }

    public void save(FolderTag FolderTag){
        folderTagRepository.save(FolderTag);
    }

    public void update (Long id, FolderTag updatedFolderTag){

        updatedFolderTag.setId(id);
        folderTagRepository.save(updatedFolderTag);
    }

    public void delete(Long id){

        folderTagRepository.deleteById(id);
    }
}
