package reference.comparator;

import reference.domain.Rating;

import java.util.*;

import reference.domain.*;

public class FilmComparator implements Comparator<Film> {
    private Map<Film,List<Rating>> ratings;

    public FilmComparator(Map<Film, List<Rating>> ratings){
        this.ratings = ratings;
    }

    public int compare(Film film, Film film1){
        List<Rating> list = this.ratings.get(film);
        Iterator<Rating> iterator = list.iterator();
        int value = 0;
        int value1 = 0;
        while(iterator.hasNext()){
            value += iterator.next().getValue();
        }
       int avg = value/list.size()-1;

        List<Rating> list1 = this.ratings.get(film1);
        Iterator<Rating> iterator1 = list1.iterator();
        while(iterator1.hasNext()){
            value1 += iterator1.next().getValue();
        }
       int avg1 = value1/list1.size()-1;

        return avg1-avg;
    }
}
