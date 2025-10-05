package com.example.demo.model;
import jakarta.persistence .*;

@Entity
@Table(name = "users")
public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String username;
        private String password;
        //Getters and setters

    public String getPassword() {
        return password;
    }
    public String getUsername() {
        return username;
    }

}
