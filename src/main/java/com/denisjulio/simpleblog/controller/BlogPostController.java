package com.denisjulio.simpleblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.denisjulio.simpleblog.entity.BlogPost;
import com.denisjulio.simpleblog.repository.BlogPostRepository;

import org.springframework.ui.Model;

@Controller
public class BlogPostController {

    private final BlogPostRepository blogPostRepository;

    public BlogPostController(BlogPostRepository blogPostRepository) {
        this.blogPostRepository = blogPostRepository;
    }

    @GetMapping("/")
    public String getHome(Model model) {
        model.addAttribute("posts", blogPostRepository.findAll());
        return "index";
    }

    @GetMapping("/post/{id}")
    public String getPostById(@PathVariable Integer id, Model model) {
        var blogPost = blogPostRepository.findById(id)
                .orElseThrow();
        model.addAttribute("post", blogPost);
        return "blog-post";
    }
}
