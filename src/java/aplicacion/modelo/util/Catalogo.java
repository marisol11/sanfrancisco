/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.util;

import aplicacion.modelo.dominio.Publicacion;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *publicaciones del catalogo
 * @author marii
 */
public class Catalogo implements Serializable{
    
    private List<Publicacion> publicaciones;

    /**
     * constructor por defecto
     */
    public Catalogo() {
        publicaciones=new ArrayList<>();
    }

    /**
     * constructor parametrizado
     * @param publicaciones  publiacaciones del catalogo
     */
    
    public Catalogo(List<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }
    
    //seccion getters y setters

    public List<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(List<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }
    
   
}
