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
public class Documental extends Video{
    
  private String genero;
  
  public Documental(String genero, String titulo, String nombreAutor, int año) {
        super(titulo, nombreAutor, año);
        this.genero = genero;
    }

   

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    
  
  
    

    @Override
    protected String retornarInformacion() {
         return "Documental" + "," + titulo + "," + nombreAutor + "," + año + "," + genero + ",";
    }
    
}
