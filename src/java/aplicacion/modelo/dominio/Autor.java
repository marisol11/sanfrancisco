package aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *representa un autor de una publicacion
 * @author marii
 */
public class Autor implements Serializable{
    /**
     * CODIGO UNICO PARA IDENTIFICAR LOS AUTORES
     */
    private Integer codigo;
    /**
     * apellido del autor
     */
    private String apellido;
    /**
     * nombres del autor
     */
    private String nombres;

    /**
     * constructor por defecto
     */
    public Autor() {
    }

    /**
     * constructor parametrizado
     * @param codigo identificador unico de un autor
     * @param apellido apellido del autor
     * @param nombres nombres del autor
     */
    public Autor(Integer codigo, String apellido, String nombres) {
        this.codigo = codigo;
        this.apellido = apellido;
        this.nombres = nombres;
    }
    //seccion de getters y setters

    /**
     * @return the codigo
     */
    public Integer getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    
    
}
