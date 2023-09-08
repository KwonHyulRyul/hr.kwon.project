package kr.co.kwon.blog.dto;


import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Article {
    private Long id;

    private String title;

    private String content;

    @Builder
    Article(String title, String content){
        this.title = title;
        this.content = content;
    }
}