package reference;

import reference.comparator.FilmComparator;
import reference.domain.Person;
import reference.domain.Film;
import reference.domain.Rating;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class Reference {
    private RatingRegister ratingRegister;

    public Reference(RatingRegister ratingRegister){
       this.ratingRegister=ratingRegister;

    }

    public Film recommendFilm(Person person){
        FilmComparator filmComparator = new FilmComparator(ratingRegister.filmRatings());
        if(ratingRegister.getPersonalRatings(person)!=null){


        }
            List<Film> movieList = ratingRegister.getMovies();
            Film bestFilm = movieList.get(0);
            for (int i = 0; i <= movieList.size() - 1; i++) {
                int bestValue = filmComparator.compare(bestFilm, movieList.get(i));
                if (bestValue > 0) {
                    bestFilm = movieList.get(i);
                } else {

                }
            }

            return bestFilm;
        }

}
