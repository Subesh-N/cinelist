package MovieWatchlist.MovieWatchList_TODO.Repository;

import MovieWatchlist.MovieWatchList_TODO.model.Wmovies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface watchedmve extends JpaRepository<Wmovies,Integer> {
    
}
