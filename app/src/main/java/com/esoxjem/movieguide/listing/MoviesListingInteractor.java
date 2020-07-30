package com.esoxjem.movieguide.listing;

import com.esoxjem.movieguide.Movie;
import io.reactivex.Observable;
import java.util.List;

/**
 * @author arun
 */
public interface MoviesListingInteractor {
  boolean isPaginationSupported();

  Observable<List<Movie>> fetchMovies(int page);

  Observable<List<Movie>> searchMovie(String searchQuery);
}
