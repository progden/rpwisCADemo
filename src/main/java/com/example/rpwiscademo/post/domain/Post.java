package com.example.rpwiscademo.post.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Post {
    private String id;
    private String title;
    private String content;
    private String userId;
}
