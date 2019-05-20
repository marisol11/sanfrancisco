/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.util;

import aplicacion.modelo.dominio.Autor;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marii
 */
public class ListadoAutores implements Serializable {
    
    /**
     * autores de algunas de las publicaciones disponibles
     */
    
    private List<Autor> autores;

    /**
     * constructor por defecto
     */
    public ListadoAutores() {
        autores=new ArrayList<>();
    }

     /**
     * constructor parametrizado
     * @param autores el listado de autores
     */
    public ListadoAutores(List<Autor> autores) {
        this.autores = autores;
    }
  
    //seccion getters y setters

    /**
     * @return the autores
     */
    public List<Autor> getAutores() {
        return autores;
    }

    /**
     * @param autores the autores to set
     */
    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }
    
    
}
