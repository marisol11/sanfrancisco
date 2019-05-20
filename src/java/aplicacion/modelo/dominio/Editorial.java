package aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *representa un editorial de una publicacion
 * @author marii
 */
public class Editorial implements Serializable{
    /**
     * CODIGO UNICO PARA IDENTIFICAR LAS EDITORIALES
     */
    private Integer codigo;
    /**
     * nombres del autor
     */
    private String nombreEditorial;

    /**
     * constructor por defecto
     */
    public Editorial() {
    }

    /**
     * constructor parametrizado
     * @param codigo identificador unico de una editorial
     * @param nombreEditorial nombre de la editorial
     */
    public Editorial(Integer codigo, String nombreEditorial) {
        this.codigo = codigo;
        this.nombreEditorial = nombreEditorial;
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

    public String getNombreEditorial() {
        return nombreEditorial;
    }

    public void setNombreEditorial(String nombreEditorial) {
        this.nombreEditorial = nombreEditorial;
    }
}