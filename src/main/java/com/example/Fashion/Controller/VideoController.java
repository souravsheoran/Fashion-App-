package com.example.Fashion.Controller;

import com.example.Fashion.Model.Pagination;
import com.example.Fashion.Model.Video;
import com.example.Fashion.Model.VideoResponse;
import com.example.Fashion.Service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/homescreen")
public class VideoController {

    @Autowired
    private VideoService videoService;

    @GetMapping("")
    public VideoResponse getVideos() {
        List<Video> videos = videoService.getVideos();
        VideoResponse response = new VideoResponse();
        response.setVideos(videos);
        response.setPagination(createPagination());
        return response;
    }

    private Pagination createPagination() {
        Pagination pagination = new Pagination();
        pagination.setPage(1);
        pagination.setLimit(10);
        pagination.setTotalPages(1);
        pagination.setTotalVideos(1);
        pagination.setNextCursor(null);
        return pagination;
    }
}

