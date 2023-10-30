package org.launchcode.codingevents.models;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class AbstractEntity {

    @Id
    @GeneratedValue
    public int id;

    public int getId() {
        return id;
    }

}