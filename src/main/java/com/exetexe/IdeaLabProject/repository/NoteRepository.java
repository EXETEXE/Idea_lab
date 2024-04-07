package com.exetexe.IdeaLabProject.repository;

import com.exetexe.IdeaLabProject.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {
}
