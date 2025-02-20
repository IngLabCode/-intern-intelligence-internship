package com.internintelligence.movie.controller;

import com.internintelligence.movie.dto.request.MovieAddRequest;
import com.internintelligence.movie.dto.request.MovieUpdateRequest;
import com.internintelligence.movie.dto.response.MovieGetResponse;
import com.internintelligence.movie.service.serviceInter.MovieInter;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/movie")
public class MovieController {

    private final MovieInter movieInter;

    @Operation(summary = "Get movie details", description = "Retrieve a movie's details by calling this API.")
    @GetMapping("/showMovie")
    public MovieGetResponse movieGetResponse() {
        return movieInter.showMovie();
    }

    @Operation(summary = "Add a new movie", description = "Add a new movie to the database with necessary details.")
    @PostMapping("/addMovie")
    public void addMovie(
            @Parameter(description = "Movie details to be added")
            @RequestBody MovieAddRequest movieAddRequest) {
        movieInter.addMovie(movieAddRequest);
    }

    @Operation(summary = "Update movie information", description = "Update an existing movie's information.")
    @PutMapping("/updateMovie")
    public void updateMovie(
            @Parameter(description = "Updated movie details")
            @RequestBody MovieUpdateRequest movieUpdateRequest) {
        movieInter.updateMovie(movieUpdateRequest);
    }

    @Operation(summary = "Delete a movie", description = "Delete a movie from the database by its ID.")
    @DeleteMapping("/deleteMovie/{id}")
    public void deleteMovie(
            @Parameter(description = "Movie ID to be deleted")
            @PathVariable Long id) {
        movieInter.deleteById(id);
    }
}
