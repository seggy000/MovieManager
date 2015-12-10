package ch.hearc.ig.odi.moviemanager.business;

import ch.hearc.ig.odi.moviemanager.exception.UnicityException;
import java.util.*;

/**
 * @author Seggy
 *
 * An individual human being
 * 
*/
public class Person {

    Collection<Movie> movies;
    private Long id;
    private String firstName;
    private String lastname;

    /**
     *
     * @param id
     * @param firstName
     * @param lastname
     *
     * The JVM (God) gives life to a person when he invoques this magnificent function
     */
    public Person(Long id, String firstName, String lastname) {
        this.id = id;
        this.firstName = firstName;
        this.lastname = lastname;
        
        //Creates a new list of movies for the newborn
        this.movies = new ArrayList<>();
    }

    /**
     * 
     * @param movie 
     * 
     * Adds a movie to the person's personal "Watched list"
     */
    public void addMovie(Movie movie) throws UnicityException {
        
        if(this.movies.contains(movie)){
            throw new UnicityException();
        }
        
        this.movies.add(movie);
        movie.addPerson(this);
    }

    public Long getId() {
        return this.id;
    }

    /**
     *
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    /**
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return this.lastname;
    }

    /**
     *
     * @param lastname
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

}
