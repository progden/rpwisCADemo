package com.example.rpwiscademo.post.application.port.out;

import java.util.List;

public interface GetRolePort {
    List<String> getRoles(String userId);
}
