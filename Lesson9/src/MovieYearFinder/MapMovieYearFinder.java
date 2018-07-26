package MovieYearFinder;

import java.util.*;

public class MapMovieYearFinder implements MovieYearFinder {
    private SortedMap<Integer, HashSet<Movie>> movies = new TreeMap<Integer, HashSet<Movie>>();

    @Override
    public void add(Movie movie) {
        if(movies.containsKey(movie.getYear())){
            movies.get(movie.getYear()).add(movie);
        } else{
            movies.put(movie.getYear(),new HashSet<Movie>());
            add(movie);
        }
    }

    @Override
    public List<Movie> findByReleaseYear(int releaseYear){
        if(!movies.containsKey(releaseYear)){
            return new ArrayList<Movie>();
        }
        return new ArrayList<Movie>(movies.get(releaseYear));
    }

    @Override
    public List<Movie> findByReleaseYears(int minReleaseYear, int maxReleaseYear){
        SortedMap<Integer, HashSet<Movie>> releaseYearMap = movies.subMap(minReleaseYear, maxReleaseYear);
        ArrayList<Movie> result = new ArrayList<Movie>();
        Set<Map.Entry<Integer, HashSet<Movie>>> releaseYearSet = releaseYearMap.entrySet();
        for (Map.Entry<Integer, HashSet<Movie>> set : releaseYearSet) {
            result.addAll(set.getValue());
        }
        return result;
    }
}
