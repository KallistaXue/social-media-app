package com.example.social_media_app.entity;
import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Likes")
public class Likes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "like_id", updatable = false, nullable = false)
    private Long like_id;
    private int user_id;
    private int post_id;

    public Long getLike_id() {
        return like_id;
    }

    public void setLike_id(Long like_id) {
        this.like_id = like_id;
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
        if (!(o instanceof Likes likes)) return false;
        return user_id == likes.user_id && post_id == likes.post_id && Objects.equals(like_id, likes.like_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(like_id, user_id, post_id);
    }
}
