package com.melhc.myapp.facades.components;


import com.melhc.myapp.data.entity.Movie;
import com.melhc.myapp.data.repository.MovieRepository;
import com.melhc.myapp.data.request.create.MovieCreateRequest;
import com.melhc.myapp.data.request.get.MovieGetRequest;
import com.melhc.myapp.data.response.create.MovieCreateResponse;
import com.melhc.myapp.data.response.get.MovieDetailResponse;
import com.melhc.myapp.mappers.MovieMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class MovieComponent {
    private final MovieRepository movieRepository;
    private final MovieMapper movieMapper;

    public MovieCreateResponse createMovie(MovieCreateRequest createRequest){
        final Movie movie = movieRepository.save(movieMapper.toEntity(createRequest));
        return movieMapper.toDto(movie);
    }

    public MovieDetailResponse getMovie(MovieGetRequest getRequest) {
        final Movie movie = movieRepository.findByName(getRequest.getName());
        return movieMapper.toDtoDetail(movie);
    }

    public List<Movie> getAllMovies() {
        List<Movie> movieList = movieRepository.findAll();
        return movieList;
    }

    public void deleteMovie(Long id) {
        movieRepository.deleteById(id);
    }
}
