package ch.hearc.ig.odi.moviemanager.business;

import java.util.*;

public class Movie {

	Collection<Person> people;
	private Long id;
	private String name;
	private String producer;

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

}