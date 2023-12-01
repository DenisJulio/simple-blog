package com.denisjulio.simpleblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.denisjulio.simpleblog.repository.BlogPostRepository;

import org.springframework.ui.Model;

@Controller
public class BlogPostController {
    
    private final BlogPostRepository blogPostRepository;

    public BlogPostController(BlogPostRepository blogPostRepository) {
        this.blogPostRepository = blogPostRepository;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("posts", blogPostRepository.findAll());
        return "index";
    }
}
