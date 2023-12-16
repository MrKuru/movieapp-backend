package com.melhc.myapp;

import com.melhc.myapp.data.entity.Movie;
import com.melhc.myapp.data.entity.enums.Category;
import com.melhc.myapp.data.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyCommandLineRunner implements CommandLineRunner {
    @Autowired
    private MovieRepository movieRepository;
    @Override
    public void run(String... args) throws Exception {
        movieRepository.save(new Movie(1L, "Inception", "Güzel bir film", "12-12-1999", Category.ACTION));
        movieRepository.save(new Movie(2L, "Shawshank Redemption", "Hapishaneden kaçış", "15-08-1994", Category.DRAMA));
        movieRepository.save(new Movie(3L, "The Dark Knight", "Batman'in maceraları", "18-07-2008", Category.ACTION));
        movieRepository.save(new Movie(4L, "Forrest Gump", "Zeki bir adamın hayatı", "06-07-1994", Category.DRAMA));
        movieRepository.save(new Movie(5L, "Pulp Fiction", "Başka türlü bir hikaye", "10-09-1994", Category.THRILLER));
        movieRepository.save(new Movie(6L, "The Matrix", "Gerçeklik ve sanal gerçeklik", "24-03-1999", Category.THRILLER));
        movieRepository.save(new Movie(7L, "The Godfather", "Mafya hikayesi", "24-03-1972", Category.FANTASY));
        movieRepository.save(new Movie(8L, "Inglourious Basterds", "II. Dünya Savaşı hikayesi", "20-05-2009", Category.FANTASY));
        movieRepository.save(new Movie(9L, "Titanic", "Büyük bir gemi faciası", "19-12-1997", Category.ROMANCE));
    }
}
