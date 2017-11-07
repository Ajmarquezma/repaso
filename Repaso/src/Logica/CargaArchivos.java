/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class CargaArchivos {
    
    public void cargar(String ruta){
        File lectura = new File(ruta);
        Scanner flujoEntrada = null;
        if(lectura.exists()){
            try{
                flujoEntrada = new Scanner(lectura);
                flujoEntrada.useDelimiter(",");
                String tipo ="";
                while(flujoEntrada.hasNext()){
                    tipo = flujoEntrada.next().trim();
                    
                    if(tipo.equals("s")){
                        String titulo = flujoEntrada.next().trim();
                        String nombreAutor = flujoEntrada.next().trim();
                        String annio = flujoEntrada.next().trim();
                        int año = Integer.parseInt(annio);
                        //leer los tipos de tados
                        //crear el objeto
                        //agregar a la coleccion
                    }else
                    if(tipo.equals("d")){
                        //leer los tipos de tados
                        //crear el objeto
                        //agregar a la coleccion
                    }else
                    if(tipo.equals("p")){
                        //leer los tipos de tados
                        //crear el objeto
                        //agregar a la coleccion
                    }
                    System.err.println(tipo);
                }
                
                
            }catch(Exception e){
                
            }
        }
    }
    
}
