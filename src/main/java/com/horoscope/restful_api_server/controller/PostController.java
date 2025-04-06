package com.horoscope.restful_api_server.controller;

import com.horoscope.restful_api_server.model.Post;
import com.horoscope.restful_api_server.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class PostController {
    @Autowired
    private PostService postService;

    @GetMapping("post/page/{pageNum}")
    public List<Post> getPosts(@PathVariable int pageNum) {
        return postService.getPosts(pageNum);
    }

    @GetMapping("post/{postId}")
    public Post getPost(@PathVariable int postId) {
        return postService.getPost(postId);
    }

    @GetMapping("post/suggest/{quantity}")
    public List<Post> getSuggestions(@PathVariable int quantity) {
        return postService.randomPosts(quantity);
    }
}
