package ch.hearc.ig.odi.moviemanager.business;

import ch.hearc.ig.odi.moviemanager.exception.UniqueException;
import java.util.*;

/**
 * 
 * @author seggy
 * 
 * A recorded sequence of film or video images displayed on a screen with sufficient rapidity as to create the illusion of motion and continuity.
 * Can also contain aural stimulation to immerge the Person watching it.
 */
public class Movie {

	Collection<Person> people;
	private Long id;
	private String name;
	private String producer;

        /**
         * 
         * @param id
         * @param name
         * @param producer 
         * 
         * I hope this one will be good when finished
         */
        public Movie(Long id, String name, String producer) {
            this.id = id;
            this.name = name;
            this.producer = producer;
            this.people = new ArrayList<>();
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

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public String getProducer() {
		return this.producer;
	}

	/**
	 * 
	 * @param producer
	 */
	public void setProducer(String producer) {
		this.producer = producer;
	}

        
    /**
     * 
     * @param person
     * @throws UniqueException 
     * 
     * Adds a Person to the "this movie has been watched by" list
     */
    void addPerson(Person person) throws UniqueException {
        if(this.people.contains(person)){
            throw new UniqueException();
        }
        
        this.people.add(person);
        person.addMovie(this);
    }

}