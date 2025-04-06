package com.horoscope.restful_api_server.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "post")
public class Post {
    @Id
    @Column(name = "post_id")
    private int postId;
    @Column(name = "title")
    private String title;
    @Column(name = "content", columnDefinition = "TEXT")
    private String content;
    @Column(name = "publish_date")
    private String publishDate;

    public Post(){}

    public Post(int postId, String title, String content, String publishDate) {
        this.postId = postId;
        this.title = title;
        this.content = content;
        this.publishDate = publishDate;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public int getPostId() {
        return postId;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getPublishDate() {
        return publishDate;
    }
}
