package com.membersportal.model;

import jakarta.persistence.*;

@Entity
public class UserRepositoryTest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public UserRepositoryTest() {
        // Default constructor required by JPA
    }

    public UserRepositoryTest(String name) {
        this.name = name;
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

