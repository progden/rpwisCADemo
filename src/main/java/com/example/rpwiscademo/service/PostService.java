package com.example.rpwiscademo.service;

import com.example.rpwiscademo.dao.PostDBO;
import com.example.rpwiscademo.dao.PostDao;
import com.example.rpwiscademo.util.RuleMiddleware;
import com.example.rpwiscademo.service.model.CreatePostResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private RuleMiddleware ruleChecker;

    public CreatePostResult createPost(String title, String content, String userId) {
        // 輸入應該包括帖子的標題和內容，以及發帖人的使用者 ID。

        // 輸出則可以是發佈帖子的成功或失敗。特定的規則則可以是標題至少不得為空白、內容需要 20 個字以上、發帖人必須有發帖的資格等。
        if(title == null || title.trim().length() == 0) {
            throw new IllegalArgumentException("標題不得為空白");
        }
        if(content == null || content.trim().length() < 20) {
            throw new IllegalArgumentException("內容不得少於 20 個字");
        }
        if(userId == null || userId.trim().length() == 0) {
            throw new IllegalArgumentException("發帖人不得為空白");
        }
        // 假設這裡有一些邏輯，例如檢查發帖人是否有發帖的資格等等。
        List<String> roles = ruleChecker.getRoles(userId);

        if(roles.contains("poster")){
            PostDao dao = new PostDao();
            String id = dao.savePost(new PostDBO(title, content, userId));
            return new CreatePostResult("success", "發帖成功", id);
        }
        // ...
        return new CreatePostResult("fail", "發帖失敗", null);
    }
}
