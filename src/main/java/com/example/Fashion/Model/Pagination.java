package com.example.Fashion.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Pagination {

    @JsonProperty("page")
    private int page;

    @JsonProperty("limit")
    private int limit;

    @JsonProperty("total_pages")
    private int totalPages;

    @JsonProperty("total_videos")
    private int totalVideos;

    @JsonProperty("next_cursor")
    private String nextCursor;

}