package com.example.rpwiscademo.post.application.port.out;

import com.example.rpwiscademo.post.domain.Post;

public interface SavePostPort {
    Post save(Post post);
}
