package com.road.pilot.blog.api.composite.model;

import lombok.*;

/**
 * Created by road on 16. 1. 30.
 */
@Getter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Review {
    private Long id;

    private Long productId;

    private String author;

    private String subject;

    private String content;

}
