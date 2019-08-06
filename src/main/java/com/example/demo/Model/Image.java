package com.example.demo.Model;


import javax.persistence.*;

@Entity
public class Image {
    @Id @GeneratedValue
    private Long id;
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "person_name",referencedColumnName = "person_name_id")
    private Person person;

    public Image() {
    }

    public Image(String name)
    {
        this.name=name;
    }

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
