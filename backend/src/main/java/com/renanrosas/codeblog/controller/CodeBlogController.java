package com.renanrosas.codeblog.controller;

import com.renanrosas.codeblog.model.Post;
import com.renanrosas.codeblog.service.CodeBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CodeBlogController {

    @Autowired
    CodeBlogService codeBlogService;

    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    public ModelAndView getPosts(){
        ModelAndView mv = new ModelAndView("posts");
        List<Post> posts = codeBlogService.findAll();
        mv.addObject("post",posts);
        return mv;
    }
}
