package MovieWatchlist.MovieWatchList_TODO.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
public class Wmovies {

    @Id private int Id;
    private String moviename;
    private String genre;
    @Getter
    boolean watched;


    public void setWatched(boolean watched) {
        this.watched = watched;
    }

    public int getSrno() {
        return Id;
    }

    public void setSrno(int Id) {
        this.Id = Id;
    }

    public String getMoviename() {
        return moviename;
    }

    public void setMoviename(String moviename) {
        this.moviename = moviename;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


}
