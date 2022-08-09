import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {


    @Test

    public void shouldFindLastMovies() {
        MovieManager manager = new MovieManager(10);

        manager.addMovie("movie1");
        manager.addMovie("movie2");
        manager.addMovie("movie3");
        manager.addMovie("movie4");
        manager.addMovie("movie5");
        manager.addMovie("movie6");
        manager.addMovie("movie7");
        manager.addMovie("movie8");
        manager.addMovie("movie9");
        manager.addMovie("movie10");

        String[] expected = {"movie10", "movie9", "movie8", "movie7", "movie6", "movie5", "movie4", "movie3", "movie2", "movie1"};
        String[] actual = manager.findLastMovies();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void shouldFindAllMovies() {
        MovieManager manager = new MovieManager();

        manager.addMovie("movie1");
        manager.addMovie("movie2");
        manager.addMovie("movie3");
        manager.addMovie("movie4");
        manager.addMovie("movie5");
        manager.addMovie("movie6");
        manager.addMovie("movie7");
        manager.addMovie("movie8");
        manager.addMovie("movie9");
        manager.addMovie("movie10");

        String[] expected = {"movie1", "movie2", "movie3", "movie4", "movie5", "movie6", "movie7", "movie8", "movie9", "movie10"};
        String[] actual = manager.findAllMovies();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldFindLastMoviesIfMoreThanLimit() {
        MovieManager manager = new MovieManager(12);
        manager.addMovie("movie1");
        manager.addMovie("movie2");
        manager.addMovie("movie3");
        manager.addMovie("movie4");
        manager.addMovie("movie5");
        manager.addMovie("movie6");
        manager.addMovie("movie7");
        manager.addMovie("movie8");
        manager.addMovie("movie9");
        manager.addMovie("movie10");


        String[] expected = {"movie10", "movie9", "movie8", "movie7", "movie6", "movie5", "movie4", "movie3", "movie2", "movie1"};
        String[] actual = manager.findLastMovies();

        Assertions.assertArrayEquals(expected, actual);
    }

}
