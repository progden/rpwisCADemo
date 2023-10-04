package com.example.rpwiscademo.post.application.port.out;

import com.example.rpwiscademo.post.domain.Post;

import java.util.List;

public interface GetRolePort {
    List<String> getRoles(Post post);
}
