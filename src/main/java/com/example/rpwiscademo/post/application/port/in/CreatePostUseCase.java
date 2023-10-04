package com.example.rpwiscademo.post.application.port.in;

import com.example.rpwiscademo.post.domain.Post;

public interface CreatePostUseCase {
    CreatePostResult createPost(Post post) throws InvalidPostException;
}
