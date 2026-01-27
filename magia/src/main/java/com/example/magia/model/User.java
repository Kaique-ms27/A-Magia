package com.example.magia.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "UserTable")
@Getter
@Setter
public class User {

    @Id
    @Column(name = "user_id")
    private String userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_email")
    private String userEmail;

    @Column(name = "user_password")
    private String userPassword;

    @Column(name = "role")
    private position position;

    public User() {
    }

    public User(String userId, String userName, String userEmail,
                String userPassword, position position) {
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.position = position;
    }

    public enum position {
        ADMIN,
        FUNCIONARIO
    }
}
