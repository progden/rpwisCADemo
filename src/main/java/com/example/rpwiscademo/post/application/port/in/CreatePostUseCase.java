package com.example.rpwiscademo.post.application.port.in;

public interface CreatePostUseCase {
    CreatePostResult createPost(String title, String content, String userId);
}
