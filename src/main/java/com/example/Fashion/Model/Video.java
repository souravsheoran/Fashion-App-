package com.example.Fashion.Model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String videoUrl;
    private String thumbnailUrl;
    private String description;
    private int viewCount;
    private int duration;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "video", cascade = CascadeType.ALL)
    private List<Product> products;

    private int likesCount;
    private int commentsCount;
    private int sharesCount;
    private boolean isLiked;
    private boolean isBookmarked;

    @ManyToOne
    private Music music;

    @ElementCollection
    private List<String> hashtags;

}