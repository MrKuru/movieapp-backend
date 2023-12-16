package com.melhc.myapp.data.repository;


import com.melhc.myapp.data.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
    Movie findByName(String name);
}
