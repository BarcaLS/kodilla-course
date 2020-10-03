package challenges;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieStoreApp {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        Map<String, List<String>> movieList = movieStore.getMovies();
        String result = movieList.values().stream()
                .flatMap(Collection::stream)
                .collect(Collectors.joining("!","",""));
        System.out.println(result);
    }
}
