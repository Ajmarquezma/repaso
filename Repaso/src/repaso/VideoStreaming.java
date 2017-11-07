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
public class VideoStreaming {

    private ArrayList<Video> videos;

    public VideoStreaming() {
        this.videos = new ArrayList();
    }

    public void addVideo(String titulo, int año, String director, int capitulos, int temporada) {
        Serie serie = new Serie(capitulos, temporada, titulo, director, año);
        this.videos.add(serie);
    }

    public void addVideo(String titulo, int año, String director) {
        Pelicula pelicula = new Pelicula(titulo, director, año);
        this.videos.add(pelicula);
    }

    public void addVideo(String titulo, String director, int año, String genero) {
        Documental documental = new Documental(genero, titulo, director, año);
        this.videos.add(documental);
    }

//    si fuera relacion de asociacion o agregacion
//    public void addVideos(Video video){
//        this.videos.add(video);
//    }
    public String listarVideos() {
        String listaVideos = "";
        for (Video video : videos) {
            listaVideos += video;
        }
        return listaVideos;
    }

    public ArrayList<Actor> listarActores() {
        ArrayList<Actor> actores = new ArrayList<>();
        for (Video video : videos) {
            if (video instanceof Pelicula) {
                Pelicula p = (Pelicula) video;
                actores.addAll(p.getActores());

            }
        }
        return actores;
    }

    public ArrayList<Video> getVideos() {
        return videos;
    }

}
