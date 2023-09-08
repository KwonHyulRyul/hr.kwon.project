package kr.co.kwon.blog.controller;

import kr.co.kwon.blog.dto.Article;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class BlogApiController {
    @PostMapping("/api/articles")
    public ResponseEntity<Article> addArticle(@RequestBody Article request){
        //Article saveArticle = blogService.save(request);
        Article articles = Article.builder()
                .content(request.getContent())
                .title(request.getTitle()).build();

        //주석 추가
        
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(articles);
    }

}