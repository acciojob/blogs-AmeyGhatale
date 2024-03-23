package com.driver.models;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer photoId;

    private String description;

    private String dimension;

    @JoinColumn
    @ManyToOne
    private Blog blog;


    public Image(String description, String dimension) {
        this.description = description;
        this.dimension = dimension;
    }

    public Integer getPhotoId() {
        return photoId;
    }

    public void setPhotoId(Integer photoId) {
        this.photoId = photoId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }
}
