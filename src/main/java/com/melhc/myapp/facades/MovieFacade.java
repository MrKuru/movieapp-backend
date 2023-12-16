package com.melhc.myapp.facades;

import com.melhc.myapp.data.entity.Movie;
import com.melhc.myapp.data.request.create.MovieCreateRequest;
import com.melhc.myapp.data.request.get.MovieGetRequest;
import com.melhc.myapp.data.response.create.MovieCreateResponse;
import com.melhc.myapp.data.response.get.MovieDetailResponse;
import com.melhc.myapp.facades.components.MovieComponent;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class MovieFacade {
    private final MovieComponent movieComponent;

    public MovieCreateResponse createMovie(MovieCreateRequest createRequest){
        return movieComponent.createMovie(createRequest);
    }

    public MovieDetailResponse getMovie(MovieGetRequest getRequest) {
        return movieComponent.getMovie(getRequest);
    }

    public List<Movie> getAllMovies() {
        return movieComponent.getAllMovies();
    }

    public void deleteMovie(Long id) {
        movieComponent.deleteMovie(id);
    }
}
