package com.example.rpwiscademo.post.adaptor.out;

import com.example.rpwiscademo.post.application.port.out.SavePostPort;
import com.example.rpwiscademo.post.domain.Post;
import org.springframework.stereotype.Repository;

@Repository
public class PostDao implements SavePostPort{

        @Override
        public Post save(Post post) {
            //mapping

            // jpa

            // mapping
            return null;
        }

}
