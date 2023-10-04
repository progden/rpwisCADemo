package com.example.rpwiscademo.post.application.port.in;

import com.example.rpwiscademo.post.domain.Post;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreatePostResult {
    private String result;
    private String message;
    private Post post;
}
