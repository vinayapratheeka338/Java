package positive;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

interface Searchable {
    boolean searchByKeyword(String keyword);
}

abstract class MediaItem implements Searchable {
    private String title;
    private String releaseDate;
    private double rating;

    public MediaItem(String title, String releaseDate, double rating) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public double getRating() {
        return rating;
    }
}

class Movie extends MediaItem {
    private String director;
    private int duration;
    private List<String> cast;

    public Movie(String title, String releaseDate, double rating,
                 String director, List<String> cast, int duration) {
        super(title, releaseDate, rating);
        this.director = director;
        this.cast = cast;
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public boolean searchByKeyword(String keyword) {
        keyword = keyword.toLowerCase();

        if (getTitle().toLowerCase().contains(keyword)) {
            return true;
        }

        if (director.toLowerCase().contains(keyword)) {
            return true;
        }

        for (String member : cast) {
            if (member.toLowerCase().contains(keyword)) {
                return true;
            }
        }
        return false;
    }
}

public class MovieLibMgmt4 {
    public static void sortByAttribute(List<Movie> movieList,
                                       String attribute, String order) {

        Comparator<Movie> comparator = null;
        attribute = attribute.toLowerCase();
        order = order.toLowerCase();
        switch (attribute) {
            case "title":
                comparator = Comparator.comparing(
                        m -> m.getTitle().toLowerCase());
                break;

            case "releasedate":
                comparator = Comparator.comparing(
                        m -> m.getReleaseDate().toLowerCase());
                break;

            case "director":
                comparator = Comparator.comparing(
                        m -> m.getDirector().toLowerCase());
                break;

            case "duration":
                comparator = Comparator.comparingInt(Movie::getDuration);
                break;
        }

        if (comparator != null) {
            if (order.equals("desc")) {
                comparator = comparator.reversed();
            }
            Collections.sort(movieList, comparator);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Movie> movieList = new ArrayList<>();
        int numberOfMovies = Integer.parseInt(scanner.nextLine());//input1
        for (int i = 0; i < numberOfMovies; i++) {
            String title = scanner.nextLine();//input2
            String releaseDate = scanner.nextLine();//input3
            double rating = Double.parseDouble(scanner.nextLine());//input4
            String director = scanner.nextLine();//input5
            int duration = Integer.parseInt(scanner.nextLine());//input6

            List<String> cast = new ArrayList<>(
                    Arrays.asList(scanner.nextLine().split(",")));//input7

            movieList.add(new Movie(
                    title, releaseDate, rating, director, cast, duration));
        }
        String attribute = scanner.nextLine();//input-title,releaseDate,director,duration
        String order = scanner.nextLine();//asc,desc
        String keyword = scanner.nextLine();//checked in movietitle,director name,cast
        for (Movie m : movieList) {
            if (m.searchByKeyword(keyword)) {
                System.out.println(m.getTitle());
            }
        }
        sortByAttribute(movieList, attribute, order);
        for (Movie m : movieList) {
            System.out.println(m.getTitle());
        }
    }
}