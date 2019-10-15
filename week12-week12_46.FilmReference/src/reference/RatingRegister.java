package reference;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class RatingRegister {
    private HashMap<Film,List<Rating>> allRatings;
    private HashMap<Person, HashMap<Film,Rating>> personFilms;


    public RatingRegister(){
        this.allRatings = new HashMap<Film,List<Rating>>();
        this.personFilms = new HashMap<Person,HashMap<Film, Rating>>();

    }

    public void addRating(Film film, Rating rating){
        if(!(this.allRatings.containsKey(film))){
            this.allRatings.put(film,new ArrayList());
            this.allRatings.get(film).add(rating);
        }else{
            this.allRatings.get(film).add(rating);
        }
    }
    public void addRating(Person person, Film film, Rating rating){
        if(!(this.personFilms.containsKey(person))){
            this.personFilms.put(person,new HashMap<Film,Rating>());
            this.personFilms.get(person).put(film,rating);
        }else {
            this.personFilms.get(person).put(film, rating);
        }
        if(this.allRatings.containsKey(film)){
            this.allRatings.get(film).add(rating);
        }else{
            this.allRatings.put(film,new ArrayList<Rating>());
            this.allRatings.get(film).add(rating);
        }
    }

    public List<Rating> getRatings(Film film){
        return this.allRatings.get(film);
    }

    public Map<Film, List<Rating>> filmRatings(){
        return this.allRatings;
    }
    public Rating getRating(Person person, Film film){
        if(!(this.personFilms.get(person).get(film) == null)){
            return this.personFilms.get(person).get(film);
        }
        return Rating.NOT_WATCHED;

    }
    public Map<Film, Rating> getPersonalRatings(Person person){
        if(this.personFilms.get(person)==null){
            return new HashMap<Film,Rating>();
        }
        return this.personFilms.get(person);
    }

    public List<Person> reviewers(){
        return new ArrayList<Person>(personFilms.keySet());
    }
    public List<Film> getMovies(){
        List<Film> movieList = new ArrayList<Film>();
        for(Film k : this.filmRatings().keySet()){
            movieList.add(k);
        }
        return movieList;
    }
}
