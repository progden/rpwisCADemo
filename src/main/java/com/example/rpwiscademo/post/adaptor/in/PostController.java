package com.example.rpwiscademo.post.adaptor.in;

import com.example.rpwiscademo.post.application.port.in.CreatePostUseCase;
import com.example.rpwiscademo.post.application.port.in.CreatePostResult;
import com.example.rpwiscademo.post.application.port.in.DeletePostUseCase;
import com.example.rpwiscademo.post.domain.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @Autowired
    private CreatePostUseCase service;

    private DeletePostUseCase deletepost;

    @GetMapping("/post/create")
    public CreatePostResult createPost() {
        String title = "test";
        String content= "test";
        String userId= "1234";
        return service.createPost(new Post(title, content, userId));
    }

    @GetMapping("/post/delete/{postId}")
    public CreatePostResult deletePost() {
        String postId = "1234";
        return deletepost.delete(postId);
    }


}
