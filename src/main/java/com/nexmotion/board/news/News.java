package com.nexmotion.board.news;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class News {

    private int postId;
    private int boardCode;
    private String postAuthor;
    private String postTitle;
    private LocalDateTime postDate;
    private LocalDateTime postUpdateDate;
    private String postContent;
    private int postHit;
    private String postDeleteYn;

}
