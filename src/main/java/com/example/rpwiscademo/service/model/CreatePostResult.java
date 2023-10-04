package com.example.rpwiscademo.service.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreatePostResult {
    private String result;
    private String message;
    private String postId;
}
