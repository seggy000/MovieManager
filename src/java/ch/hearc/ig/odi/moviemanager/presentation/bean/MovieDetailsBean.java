/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.moviemanager.presentation.bean;

import ch.hearc.ig.odi.moviemanager.business.Movie;
import ch.hearc.ig.odi.moviemanager.service.Services;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author seggy
 */
@Named(value = MovieDetailsBean)
@SessionScoped
public class MovieDetailsBean {
    
    @Inject Services services;
    private Movie movie;

    public MovieDetailsBean(){
    
    }
    
    public String showMovie(Movie movie){
        if(movie != null){
            this.movie = movie;
            return "show";
        }else{
            this.movie = null;
            return "error";
        }
    }
    
    public Movie getMovie(){
        return this.movie;
    }
    
    public void setMovie(Movie movie){
        this.movie = movie;
    }
    
}
