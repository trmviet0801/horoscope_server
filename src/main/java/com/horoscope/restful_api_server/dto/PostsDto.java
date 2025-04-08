package com.horoscope.restful_api_server.dto;

import com.horoscope.restful_api_server.model.Post;

import java.util.List;

public class PostsDto {
    private List<Post> posts;
    private int totalPage;

    public PostsDto(){}

    public PostsDto(List<Post> posts, int totalPage) {
        this.posts = posts;
        this.totalPage = totalPage;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public int getTotalPage() {
        return totalPage;
    }
}
