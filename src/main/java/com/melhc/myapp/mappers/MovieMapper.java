package com.melhc.myapp.mappers;


import com.melhc.myapp.data.entity.Movie;
import com.melhc.myapp.data.entity.enums.Category;
import com.melhc.myapp.data.request.create.MovieCreateRequest;
import com.melhc.myapp.data.response.create.MovieCreateResponse;
import com.melhc.myapp.data.response.get.MovieDetailResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MovieMapper {
    public Movie toEntity(MovieCreateRequest createRequest) {
        Movie movie = Movie.builder()
                .name(createRequest.getName())
                .releaseDate(createRequest.getReleaseDate())
                .category(Category.valueOf(createRequest.getCategory().name()))
                .about(createRequest.getAbout())
                .build();
        return movie;
    }

    public MovieCreateResponse toDto(Movie movie) {
        MovieCreateResponse movieCreateResponse = MovieCreateResponse.builder()
                .id(movie.getId())
                .build();
        return movieCreateResponse;
    }

    public MovieDetailResponse toDtoDetail(Movie movie) {
        MovieDetailResponse movieDetailResponse = MovieDetailResponse.builder()
                .id(movie.getId())
                .name(movie.getName())
                .about(movie.getAbout())
                .releaseDate(movie.getReleaseDate())
                .category(movie.getCategory())
                .build();
        return movieDetailResponse;
    }
}
