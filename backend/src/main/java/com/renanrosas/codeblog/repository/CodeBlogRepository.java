package com.renanrosas.codeblog.repository;

import com.renanrosas.codeblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CodeBlogRepository extends JpaRepository<Post, Long> {
}
