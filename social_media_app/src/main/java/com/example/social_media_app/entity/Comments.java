package com.example.social_media_app.entity;
import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Comments")
public class Comments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id", updatable = false, nullable = false)
    private Long comment_id;
    private String comment_content;
    private int user_id;
    private int post_id;

    public Long getComment_id() {
        return comment_id;
    }

    public void setComment_id(Long comment_id) {
        this.comment_id = comment_id;
    }

    public String getComment_content() {
        return comment_content;
    }

    public void setComment_content(String comment_content) {
        this.comment_content = comment_content;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getPost_id() {
        return post_id;
    }

    public void setPost_id(int post_id) {
        this.post_id = post_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Comments comments)) return false;
        return user_id == comments.user_id && post_id == comments.post_id && Objects.equals(comment_id, comments.comment_id) && Objects.equals(comment_content, comments.comment_content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(comment_id, comment_content, user_id, post_id);
    }
}
