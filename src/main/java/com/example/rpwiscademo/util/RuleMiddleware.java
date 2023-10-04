package com.example.rpwiscademo.util;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RuleMiddleware {
    List<String> getRoles(String userId);
}
