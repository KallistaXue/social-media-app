package com.example.social_media_app.entity;
import java.util.Objects;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;
    private String username;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String date_of_birth;

    @Override
    public String toString() {
        return "Users{" +
                "user_id=" + user_id +
                ", username='" + username + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", date_of_birth='" + date_of_birth + '\'' +
                '}';
    }
    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Users users)) return false;
        return getUser_id() == users.getUser_id() && Objects.equals(getUsername(), users.getUsername()) && Objects.equals(getFirstname(), users.getFirstname()) && Objects.equals(getLastname(), users.getLastname()) && Objects.equals(getEmail(), users.getEmail()) && Objects.equals(getPassword(), users.getPassword()) && Objects.equals(getDate_of_birth(), users.getDate_of_birth());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUser_id(), getUsername(), getFirstname(), getLastname(), getEmail(), getPassword(), getDate_of_birth());
    }
}
