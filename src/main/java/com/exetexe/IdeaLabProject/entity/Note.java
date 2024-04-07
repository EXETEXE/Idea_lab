package com.exetexe.IdeaLabProject.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(of = "text")
@ToString(of = "text")
public class Note {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;

    @ManyToMany
    @JsonIgnore
    @JoinTable(
            name = "folder_notes",
            joinColumns = @JoinColumn(name = "note_id"),
            inverseJoinColumns = @JoinColumn(name = "folder_id")

    )
    private List<Folder> folders = new ArrayList<>();

    @ManyToMany
    @JsonIgnore
    @JoinTable(
            name = "notes_folder_tags",
            joinColumns = @JoinColumn(name = "note_id"),
            inverseJoinColumns = @JoinColumn(name = "folder_tag_id")
    )
    private List<FolderTag> folderTags = new ArrayList<>();
}
