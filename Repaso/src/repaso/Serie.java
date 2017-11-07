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
public class Serie extends Video{
   private int numCapitulos;
   private int temporada;

    public Serie(int numCapitulos, int temporada, String titulo, String nombreAutor, int año) {
        super(titulo, nombreAutor, año);
        this.numCapitulos = numCapitulos;
        this.temporada = temporada;
    }

    public int getNumCapitulos() {
        return numCapitulos;
    }

    public void setNumCapitulos(int numCapitulos) {
        this.numCapitulos = numCapitulos;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    @Override
    protected String retornarInformacion() {
        return "Serie"+ "," + titulo + "," + nombreAutor + "," + año + "," + numCapitulos + "," + temporada + ",";
    }

    
   
}
