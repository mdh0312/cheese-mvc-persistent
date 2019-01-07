package org.launchcode.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Category {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=3, max=15, message = "Name must be at least 3 characters")
    private String name;

    @OneToMany
    @JoinColumn(name="category_id")
    private List<Cheese> cheeses = new ArrayList<>();

    public Category() {
    }

    public Category(String newName) {

        this.name = newName;
    }

    public String getName(){

        return this.name;
    }

    public void setName(String newName){

        this.name = newName;
    }

    public int getId(){

        return this.id;
    }
}

