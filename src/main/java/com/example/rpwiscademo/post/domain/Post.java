package com.example.rpwiscademo.post.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

public class Post {
    @Getter
    private String id;
    private String title;
    private String content;

    @Getter
    private String userId;

    public Post(String title, String content, String userId) {
        this.title = title;
        this.content = content;
        this.userId = userId;
    }

    public boolean isValideUserId() {
        return userId == null || userId.trim().isEmpty();
    }

    public boolean isValidContentLength() {
        return content == null || content.trim().length() < 20;
    }

    public boolean isValidTitle() {
        return title == null || title.trim().isEmpty();
    }
}
