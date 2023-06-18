package com.example.social_media_app.entity;
import java.util.Objects;
import javax.persistence.*;

@Entity
@Table(name = "Posts")
public class Posts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id", updatable = false, nullable = false)
    private Long post_id;
    private String post_content;
    private int user_id;

    public Long getPost_id() {
        return post_id;
    }

    public String getPost_content() {
        return post_content;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setPost_content(String post_content) {
        this.post_content = post_content;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Posts posts)) return false;
        return getPost_id().equals(posts.getPost_id()) && getUser_id() == posts.getUser_id() && Objects.equals(getPost_content(), posts.getPost_content());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPost_id(), getPost_content(), getUser_id());
    }
}
