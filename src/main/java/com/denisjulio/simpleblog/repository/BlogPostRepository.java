package com.denisjulio.simpleblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.denisjulio.simpleblog.entity.BlogPost;

public interface BlogPostRepository extends JpaRepository<BlogPost, Integer> {
}
