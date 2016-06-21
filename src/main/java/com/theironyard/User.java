package com.theironyard;

import javax.persistence.*;

@Entity
@Table(name = "users") //sets table name
public class User {
    @Id
    @GeneratedValue //auto generate Id
    int id;

    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public User() {
    }
}
