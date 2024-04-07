package com.exetexe.IdeaLabProject.service;

import com.exetexe.IdeaLabProject.entity.Note;
import com.exetexe.IdeaLabProject.repository.NoteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional()
public class NoteService {

    private final NoteRepository noteRepository;

    @Autowired
    public NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public List<Note> findAll(){

        return noteRepository.findAll();
    }

    public Note findOne(Long id){
        Optional<Note> foundNote =  noteRepository.findById(id);

        return foundNote.orElse(null);
    }

    public void save(Note note){
        noteRepository.save(note);
    }

    public void update (Long id, Note updatedNote){

        updatedNote.setId(id);
        noteRepository.save(updatedNote);
    }

    public void delete(Long id){

        noteRepository.deleteById(id);
    }


}
