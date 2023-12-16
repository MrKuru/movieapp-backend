package com.melhc.myapp.service;

import com.melhc.myapp.data.entity.Movie;
import com.melhc.myapp.data.request.create.MovieCreateRequest;
import com.melhc.myapp.data.request.get.MovieGetRequest;
import com.melhc.myapp.data.response.create.MovieCreateResponse;
import com.melhc.myapp.data.response.get.MovieDetailResponse;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

public interface MovieService {
    @PostMapping("create/movie")
    MovieCreateResponse createMovie(@RequestBody @Valid MovieCreateRequest createRequest);

    @GetMapping("movies/{id}")
    MovieDetailResponse getMovie(@RequestBody @Valid MovieGetRequest getRequest);

    @GetMapping("movies")
    List<Movie> getAllMovies();

    @DeleteMapping("delete")
    void deleteMovie(@RequestBody @Valid Long id);
}
