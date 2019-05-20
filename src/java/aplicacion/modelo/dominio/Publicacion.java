package aplicacion.modelo.dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *representa una publicación registrada de la biblioteca
 * @author marii
 */
public class Publicacion {
    private int isbn;
    private Date fechaInventario;
    private Integer numeroInventario;
    private List<Autor> autores;
    private String titulo;
    private String edicion;
    private UbicacionEdicion ubicacionEdicion;
    private Editorial editorial;
    private Short anioPublicacion;
    private String cdu;
    private String observaciones;

    public Publicacion() {
        autores=new ArrayList<>();
        ubicacionEdicion=new UbicacionEdicion();
        editorial=new Editorial();
    }

    public Publicacion(int isbn, Date fechaInventario, Integer numeroInventario, List<Autor> autores, String titulo, String edicion, UbicacionEdicion ubicacionEdicion, Editorial editorial, Short anioPublicacion, String cdu, String observaciones) {
        this.isbn = isbn;
        this.fechaInventario = fechaInventario;
        this.numeroInventario = numeroInventario;
        this.autores = autores;
        this.titulo = titulo;
        this.edicion = edicion;
        this.ubicacionEdicion = ubicacionEdicion;
        this.editorial = editorial;
        this.anioPublicacion = anioPublicacion;
        this.cdu = cdu;
        this.observaciones = observaciones;
    }
    
   //seccion getters y setters

    /**
     * @return the isbn
     */
    public int getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the fechaInventario
     */
    public Date getFechaInventario() {
        return fechaInventario;
    }

    /**
     * @param fechaInventario the fechaInventario to set
     */
    public void setFechaInventario(Date fechaInventario) {
        this.fechaInventario = fechaInventario;
    }

    /**
     * @return the numeroInventario
     */
    public Integer getNumeroInventario() {
        return numeroInventario;
    }

    /**
     * @param numeroInventario the numeroInventario to set
     */
    public void setNumeroInventario(Integer numeroInventario) {
        this.numeroInventario = numeroInventario;
    }

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

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the edicion
     */
    public String getEdicion() {
        return edicion;
    }

    /**
     * @param edicion the edicion to set
     */
    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    /**
     * @return the ubicacionEdicion
     */
    public UbicacionEdicion getUbicacionEdicion() {
        return ubicacionEdicion;
    }

    /**
     * @param ubicacionEdicion the ubicacionEdicion to set
     */
    public void setUbicacionEdicion(UbicacionEdicion ubicacionEdicion) {
        this.ubicacionEdicion = ubicacionEdicion;
    }

    /**
     * @return the editorial
     */
    public Editorial getEditorial() {
        return editorial;
    }

    /**
     * @param editorial the editorial to set
     */
    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    /**
     * @return the anioPublicacion
     */
    public Short getAnioPublicacion() {
        return anioPublicacion;
    }

    /**
     * @param anioPublicacion the anioPublicacion to set
     */
    public void setAnioPublicacion(Short anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    /**
     * @return the cdu
     */
    public String getCdu() {
        return cdu;
    }

    /**
     * @param cdu the cdu to set
     */
    public void setCdu(String cdu) {
        this.cdu = cdu;
    }

    /**
     * @return the observaciones
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * @param observaciones the observaciones to set
     */
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    
}
