package com.exetexe.IdeaLabProject.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(of = "name")
@ToString(of = "name")
public class FolderTag {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    private Folder folder;

    @ManyToMany
    @JoinTable(
            name = "notes_folder_tags",
            joinColumns = @JoinColumn(name = "folder_tag_id"),
            inverseJoinColumns = @JoinColumn(name = "note_id")
    )
    private List<Note> notes = new ArrayList<>();
}
