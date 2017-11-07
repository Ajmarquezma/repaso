/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;

/**
 *
 * @author Estudiante
 */
public abstract class Video {
    
  protected String titulo;
  protected String nombreAutor;
  protected int año;

    public Video(String titulo, String nombreAutor, int año) {
        this.titulo = titulo;
        this.nombreAutor = nombreAutor;
        this.año = año;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

      
  
  
    /**
     *
     * @return String
     */
    protected abstract String retornarInformacion();
    
}
