package com.internintelligence.movie.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        Info info = new Info()
                .title("Movie Database API")
                .version("1.0")
                .description("This API provides functionality for managing movie data. It supports operations such as retrieving, adding, updating, and deleting movie information. The movie database includes key details such as title, director, release year, genre, and IMDb rating.\n\n" +
                        "Key features of the API include:\n" +
                        "- **Retrieve Movie Details**: Allows users to get information about movies by ID or search criteria.\n" +
                        "- **Add Movie**: Allows users to add a new movie to the database by providing necessary details such as title, director, release year, genre, and IMDb rating.\n" +
                        "- **Update Movie**: Users can update movie details by specifying the movie ID and new information.\n" +
                        "- **Delete Movie**: Allows users to delete a movie from the database by its ID.\n" +
                        "- **Search Movies**: Users can search for movies by title, genre, or director.\n\n" +
                        "This API is designed to be secure, scalable, and provide a seamless experience for users who want to manage and interact with movie data.")
                .contact(new io.swagger.v3.oas.models.info.Contact()
                        .name("Inqilab")
                        .email("eliyevinqlab.02@gmail.com"));

        return new OpenAPI().info(info);
    }
}
