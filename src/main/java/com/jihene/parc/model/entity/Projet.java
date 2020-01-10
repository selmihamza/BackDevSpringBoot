package com.jihene.parc.model.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Projet {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name = "NAME", length = 50)
    @NotNull
    private String name;

    @Column(name = "BUDGET", length = 50)
    @NotNull
    private String budget;

    @Column(name = "DEADLINE", length = 50)
    @NotNull
    private String deadline;

    @Column(name = "DESCRIPTION", length = 500)
    @NotNull
    private String description;

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

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
