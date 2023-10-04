package com.example.rpwiscademo.post.application.port.in;

import com.example.rpwiscademo.post.application.port.in.CreatePostResult;

public interface DeletePostUseCase {

    CreatePostResult delete(String postId);
}
