package ru.zhdanov.springboot.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "wikimedia_recent_changes")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class WikimediaData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "wiki_event_data")
    @Lob
    private String wikiEventData;
}
