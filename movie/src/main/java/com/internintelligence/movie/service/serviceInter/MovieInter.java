package com.internintelligence.movie.service.serviceInter;

import com.internintelligence.movie.dto.request.MovieAddRequest;
import com.internintelligence.movie.dto.request.MovieUpdateRequest;
import com.internintelligence.movie.dto.response.MovieGetResponse;
import com.internintelligence.movie.model.Movie;

public interface MovieInter {
    void addMovie(MovieAddRequest movieAddRequest);

    MovieGetResponse showMovie();

    void deleteById(Long id);

    void updateMovie(MovieUpdateRequest movieUpdateRequest);
}
