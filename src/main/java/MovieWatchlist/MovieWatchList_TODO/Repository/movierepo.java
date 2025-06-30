package MovieWatchlist.MovieWatchList_TODO.Repository;

import MovieWatchlist.MovieWatchList_TODO.model.Wmovies;
import MovieWatchlist.MovieWatchList_TODO.service.MovieService;
import MovieWatchlist.MovieWatchList_TODO.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface movierepo extends JpaRepository<Movie,Integer> {
    List<Movie> findAllById(int srno);
}

