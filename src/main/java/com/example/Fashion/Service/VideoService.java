package com.example.Fashion.Service;

import com.example.Fashion.Model.Video;
import com.example.Fashion.Repositories.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoService {

    @Autowired
    private VideoRepository videoRepository;

    public List<Video> getVideos() {
        return videoRepository.findAll();
    }
}