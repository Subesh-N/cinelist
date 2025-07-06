package MovieWatchlist.MovieWatchList_TODO.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
public class Movie {
    @Id
    private int Id;
    @NotNull(message ="movie name cannot be null")
    @Column(nullable = false)
    private String moviename;
    @NotNull(message ="genre name cannot be null")
    @Column(nullable = false)
    private String genre;
    private boolean watched;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getMoviename() {
        return moviename;
    }

    public void setMoviename(String moviename) {
        this.moviename = moviename;
    }

    public boolean isWatched() {
        return watched;
    }

    public void setWatched(boolean watched) {
        this.watched = watched;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}


