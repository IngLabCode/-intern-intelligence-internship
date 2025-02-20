package com.internintelligence.movie.dto.response;

import lombok.Data;

@Data
public class MovieGetResponse {
    private String title;
    private String director;
    private Integer releaseYear;
    private String genre;
    private Double imdbRating;
}
