package com.jihene.parc.model.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "TACHE")
public class Tache {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name = "NAME", length = 50)
    @NotNull
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
