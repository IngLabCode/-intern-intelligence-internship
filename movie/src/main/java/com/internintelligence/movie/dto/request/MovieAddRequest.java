package com.internintelligence.movie.dto.request;

import lombok.Data;

@Data
public class MovieAddRequest {
    private String title;
    private String director;
    private Integer releaseYear;
    private String genre;
    private Double imdbRating;
}
