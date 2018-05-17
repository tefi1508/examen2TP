package com.ucbcba.taller.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

public class LevelPrice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @NotNull
    private String description;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
