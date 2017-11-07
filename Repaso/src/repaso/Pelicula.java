/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

import java.util.*;

/**
 *
 * @author Estudiante
 */
public class Pelicula extends Video{
    
    private ArrayList<Actor> actores;

    public Pelicula(String titulo, String nombreAutor,  int año) {
        super(titulo, nombreAutor, año);
          this.actores = new ArrayList();
    }

    
    
    public void addActores(Actor actor){
        actores.add(actor);
    }

    public ArrayList<Actor> getActores() {
        return actores;
    }
    

    @Override
    protected String retornarInformacion() {
        String listaActores = "";
        for(Actor actor : actores){
            listaActores+=actor + ",";
        }
       return "Pelicula"+ "," + titulo + "," + nombreAutor + "," + año + "," + listaActores + ",";
    }
    
}
