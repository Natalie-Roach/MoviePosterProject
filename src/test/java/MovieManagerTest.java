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

    public void shouldFindLastMoviesIfLimit12() {
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

    //ДОРАБОТКА ЗАДАНИЯ
    @Test

    public void shouldFindLastMoviesIfQuantityOfMoviesLessThanLimit() {
        MovieManager manager = new MovieManager(10);
        manager.addMovie("movie1");
        manager.addMovie("movie2");
        manager.addMovie("movie3");
        manager.addMovie("movie4");
        manager.addMovie("movie5");
        manager.addMovie("movie6");
        manager.addMovie("movie7");

        String[] expected = {"movie7", "movie6", "movie5", "movie4", "movie3", "movie2", "movie1"};
        String[] actual = manager.findLastMovies();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void shouldFindLastMoviesIfQuantityOfMoviesSameAsLimit() {
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

    public void shouldFindLastMoviesIfQuantityOfMoviesMoreThanLimit() {
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
        manager.addMovie("movie11");
        manager.addMovie("movie12");
        manager.addMovie("movie13");
        manager.addMovie("movie14");
        manager.addMovie("movie15");

        String[] expected = {"movie15", "movie14", "movie13", "movie12", "movie11", "movie10", "movie9", "movie8", "movie7", "movie6"};
        String[] actual = manager.findLastMovies();

        Assertions.assertArrayEquals(expected, actual);


    }

}
