package com.renanrosas.codeblog.service;

import com.renanrosas.codeblog.model.Post;

import java.util.List;

public interface CodeBlogService {

    List<Post> findAll();
    Post findById(long id);
    Post save(Post post);
}
