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
public class Folder {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany
    private List<FolderTag> folderTags = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "folder_notes",
            joinColumns = @JoinColumn(name = "folder_id"),
            inverseJoinColumns = @JoinColumn(name = "note_id")
    )
    private List<Note> notes = new ArrayList<>();

}
