package com.internintelligence.movie.service.serviceImpl;

import com.internintelligence.movie.dto.request.MovieAddRequest;
import com.internintelligence.movie.dto.request.MovieUpdateRequest;
import com.internintelligence.movie.dto.response.MovieGetResponse;
import com.internintelligence.movie.model.Movie;
import com.internintelligence.movie.repository.MovieRepository;
import com.internintelligence.movie.service.serviceInter.MovieInter;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovieImpl implements MovieInter {
    private final MovieRepository movieRepository;


    @Override
    public void addMovie(MovieAddRequest movieAddRequest) {
        Movie movie=new Movie();
        movie.setDirector(movieAddRequest.getDirector());
        movie.setGenre(movieAddRequest.getGenre());
        movie.setTitle(movieAddRequest.getTitle());
        movie.setImdbRating(movieAddRequest.getImdbRating());
        movie.setReleaseYear(movieAddRequest.getReleaseYear());
        movieRepository.save(movie);

    }

    @Override
    public MovieGetResponse showMovie() {
        Movie movie=new Movie();
        MovieGetResponse movieGetResponse = new MovieGetResponse();
        movieGetResponse.setDirector(movie.getDirector());
        movieGetResponse.setTitle(movie.getTitle());
        movieGetResponse.setGenre(movie.getGenre());
        movieGetResponse.setReleaseYear(movie.getReleaseYear());
        movieGetResponse.setImdbRating(movie.getImdbRating());
        return movieGetResponse;

    }

    @Override
    public void deleteById(Long id) {
        Movie movie = movieRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Id not found!"));
        movieRepository.deleteById(id);
    }

    @Override
    public void updateMovie(MovieUpdateRequest movieUpdateRequest) {
        Movie movie = new Movie();
        movie.setGenre(movieUpdateRequest.getGenre());
        movie.setTitle(movieUpdateRequest.getTitle());
        movie.setReleaseYear(movieUpdateRequest.getReleaseYear());
        movie.setImdbRating(movieUpdateRequest.getImdbRating());
        movie.setDirector(movieUpdateRequest.getDirector());
        movieRepository.save(movie);

    }
}
