package com.horoscope.restful_api_server.service;

import com.horoscope.restful_api_server.dto.PostsDto;
import com.horoscope.restful_api_server.model.Post;
import com.horoscope.restful_api_server.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public PostsDto getPosts(int pageNum) {
        Pageable pageable = PageRequest.of(pageNum, 10);
        Page<Post> posts = postRepository.findAll(pageable);
        return new PostsDto(posts.getContent(), posts.getTotalPages());
    }

    public Post getPost(int postId) {
        return postRepository.findById(postId).isPresent() ? postRepository.findById(postId).get() : null;
    }

    public List<Post> randomPosts (int quantity) {
        long dbSize = postRepository.count();
        Random random = new Random();
        List<Post> posts = new ArrayList<>();

        if (quantity > dbSize)
            return List.of();
        if (quantity == dbSize)
            return getPosts(0).getPosts();

        for (int i = 0; i < quantity; i++) {
            boolean cont = true;
            while (cont) {
                Optional<Post> post = postRepository.findById(random.nextInt(0, (int) dbSize));
                if (post.isPresent() && post != null && !posts.contains(post)) {
                    posts.add(post.get());
                    cont = false;
                }
            }
        }
        return posts;
    }
}
