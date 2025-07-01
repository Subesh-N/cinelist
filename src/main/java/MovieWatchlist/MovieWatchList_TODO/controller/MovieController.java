package MovieWatchlist.MovieWatchList_TODO.controller;


import MovieWatchlist.MovieWatchList_TODO.model.Movie;
import MovieWatchlist.MovieWatchList_TODO.model.Wmovies;
import MovieWatchlist.MovieWatchList_TODO.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class MovieController {

    @Autowired
    MovieService movieservice;

    @GetMapping("/home")
    public List<Movie> getmoviedetails(){
        return movieservice.getmoviedetails();
    }

    @PostMapping("/addmovies")
    public Movie addmovies(@RequestBody Movie movie){
        return movieservice.addmovie(movie);

    }

    @DeleteMapping("/removemovie/{srno}")
    public void removemovie(@PathVariable int srno){
        movieservice.removemovie(srno);
    }

    @DeleteMapping("/WatchedMovies/{srno}")
    public void markaswatched(@PathVariable int srno){
        movieservice.markaswatched(srno);
    }

    @GetMapping("/home/watchedmovies")
    public List<Wmovies> getwatchedmovies(){
        return movieservice.getwatchedmovies();
    }

}
