package com.example.rpwiscademo.controller;

import com.example.rpwiscademo.service.PostService;
import com.example.rpwiscademo.service.model.CreatePostResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @Autowired
    private PostService service;

    @GetMapping("/post/create")
    public CreatePostResult createPost() {
        String title = "test";
        String content= "test";
        String userId= "1234";
        return service.createPost(title, content, userId);
    }
}
