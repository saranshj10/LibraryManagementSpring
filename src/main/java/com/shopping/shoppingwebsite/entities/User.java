package com.shopping.shoppingwebsite.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "user_table")
public class User {

    @Id
    String userName;
    String password;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public User(){}

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
