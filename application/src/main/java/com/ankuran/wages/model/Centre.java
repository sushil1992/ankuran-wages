package com.ankuran.wages.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Sushil Mittal.
 * @Created At 24/02/19.
 */
@Entity
@Table(name = "centre")
public class Centre {

    @Id
    private Long id;

    @Column(name = "name")
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
