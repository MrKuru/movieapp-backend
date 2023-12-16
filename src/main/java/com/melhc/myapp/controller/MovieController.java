package com.melhc.myapp.controller;


import com.melhc.myapp.data.entity.Movie;
import com.melhc.myapp.data.request.create.MovieCreateRequest;
import com.melhc.myapp.data.request.get.MovieGetRequest;
import com.melhc.myapp.data.response.create.MovieCreateResponse;
import com.melhc.myapp.data.response.get.MovieDetailResponse;
import com.melhc.myapp.facades.MovieFacade;
import com.melhc.myapp.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MovieController implements MovieService {

    private final MovieFacade movieFacade;

    @Override
    public MovieCreateResponse createMovie(MovieCreateRequest createRequest) {
        return movieFacade.createMovie(createRequest);
    }

    @Override
    public MovieDetailResponse getMovie(MovieGetRequest getRequest) {
        return movieFacade.getMovie(getRequest);
    }

    @Override
    public List<Movie> getAllMovies() {
        return movieFacade.getAllMovies();
    }

    @Override
    public void deleteMovie(Long id) {
        movieFacade.deleteMovie(id);
    }
}
