package com.example.demo.Model;

import javax.persistence.*;

@Entity
@Table(name = "phrases")
public class Phrases {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long Id;
    private String Phrases;
    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        this.Id = id;
    }
    public String getPhrase() {
        return Phrases;
    }

    public void setPhrase(String phrase) {
        this.Phrases = phrase;
    }
}
