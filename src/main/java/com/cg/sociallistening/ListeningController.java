package com.cg.sociallistening;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class ListeningController {


    @GetMapping()
    public List<Tweet> getAllTweets(){

        return Stream.of(
               Tweet.builder().id(1).tweetText("test").reply("sf").handler("test1").build(),
               Tweet.builder().id(2).tweetText("test").reply("sf").handler("test2").build(),
               Tweet.builder().id(3).tweetText("test").reply("sf").handler("test3").build(),
               Tweet.builder().id(4).tweetText("test").reply("sf").handler("test4").build(),
               Tweet.builder().id(5).tweetText("test").reply("sf").handler("test5").build(),
               Tweet.builder().id(6).tweetText("test").reply("sf").handler("test6").build(),
               Tweet.builder().id(7).tweetText("test").reply("sf").handler("test6").build(),
               Tweet.builder().id(8).tweetText("test").reply("sf").handler("test6").build()
        ).collect(Collectors.toList());
    }
}
