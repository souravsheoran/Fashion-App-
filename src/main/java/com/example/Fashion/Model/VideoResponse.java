package com.example.Fashion.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class VideoResponse {

    @JsonProperty("videos")
    private List<Video> videos;

    @JsonProperty("pagination")
    private Pagination pagination;

    // Getters and Setters

    public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }
}
