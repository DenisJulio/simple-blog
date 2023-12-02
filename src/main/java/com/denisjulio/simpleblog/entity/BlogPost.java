package com.denisjulio.simpleblog.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class BlogPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;
    private String content;

    public String getTitle() {
        return title;
    }

    @ManyToOne
    private Author author;

    public BlogPost() {
    }

    public Integer getId() {
        return id;
    }

    public BlogPost setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getContent() {
        return content;
    }

    public BlogPost setContent(String content) {
        this.content = content;
        return this;
    }

    public Author getAuthor() {
        return author;
    }

    public BlogPost setAuthor(Author author) {
        this.author = author;
        return this;
    }
}
