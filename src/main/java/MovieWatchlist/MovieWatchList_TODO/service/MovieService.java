package MovieWatchlist.MovieWatchList_TODO.service;

import MovieWatchlist.MovieWatchList_TODO.Repository.watchedmve;
import MovieWatchlist.MovieWatchList_TODO.model.Movie;
import MovieWatchlist.MovieWatchList_TODO.Repository.movierepo;
import MovieWatchlist.MovieWatchList_TODO.model.Wmovies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    movierepo movrepo;

    @Autowired
    watchedmve Wmve;

    public List<Movie> getmoviedetails() {
        return movrepo.findAll();
    }

    public Movie addmovie(Movie movie) {
        return movrepo.save(movie);
    }

    public void removemovie(int srno) {
        movrepo.deleteById(srno);
    }

    public void markaswatched(int srno) {
        // 1. Fetch the movie and unwrap Optional
        Movie movie = movrepo.findById(srno)
                .orElseThrow(() -> new RuntimeException("Movie not found with srno: " + srno));

        // 2. Copy data to Wmovies
        Wmovies wmovie = new Wmovies();
        wmovie.setSrno(movie.getId());
        wmovie.setMoviename(movie.getMoviename());
        wmovie.setGenre(movie.getGenre());
        wmovie.setWatched(true);
        Wmve.save(wmovie);
        movrepo.deleteById(srno);
    }


    public List<Wmovies> getwatchedmovies() {
        return Wmve.findAll();
    }

    public void removewatchedmove(int srno) {
        Wmve.deleteById(srno);
    }
}
