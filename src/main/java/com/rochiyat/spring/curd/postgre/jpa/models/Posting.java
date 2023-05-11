package com.rochiyat.spring.curd.postgre.jpa.models;

import javax.persistence.*;

@Entity
@Table(name = "posting")
public class Posting {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "tittle")
    private String tittle;

    @Column(name = "description")
    private String description;

    @Column(name = "published")
    private boolean published;

    public Posting() {
    }

    public Posting(String tittle, String description, boolean published) {
        this.tittle = tittle;
        this.description = description;
        this.published = published;
    }

    public long getId() {
        return id;
    }

    public String getTittle() {
        return tittle;
    }

    public String getDescription() {
        return description;
    }

    public boolean isPublished() {
        return published;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    @Override
    public String toString() {
        return "Posting {" +
                "id=" + id +
                ", tittle='" + tittle + '\'' +
                ", description='" + description + '\'' +
                ", published=" + published +
                '}';
    }
}
