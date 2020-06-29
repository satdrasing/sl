package com.cg.sociallistening;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Tweet {

    private long id;

    private String handler;

    private String tweetText;

    private String reply;
}
