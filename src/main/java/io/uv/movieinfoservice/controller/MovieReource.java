package io.uv.movieinfoservice.controller;

import io.uv.movieinfoservice.models.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project: movie-info-service
 * Package: io.uv.movieinfoservice.controller
 * <p>
 * User: vamshi
 * Date: 2019-07-21
 * Time: 10:15
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping("/movies")
public class MovieReource {

    @GetMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable String movieId){
        return new Movie(movieId, "Test");
    }

}
