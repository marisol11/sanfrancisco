package aplicacion.modelo.dominio;

/**
 *representa un lugar donde se ha editado publicaciones
 * @author marii
 */
public class UbicacionEdicion {
    /**
     * representa un identificador unico para identificar una ubicacion de edicion
     */
    private Integer codigo;
    /**
     * lugar de edicion
     */
    private String lugarEdicion;

    /**
     * constructor por defecto
     */
    public UbicacionEdicion() {
    }

    /**
     * constructor parametrizado
     * @param codigo identificador unico para identificar una ubicacion de edicion
     * @param lugarEdicion nombre del lugar de edicion
     */
    public UbicacionEdicion(Integer codigo, String lugarEdicion) {
        this.codigo = codigo;
        this.lugarEdicion = lugarEdicion;
    }
    
    //seccion getters y setters

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
     * @return the lugarEdicion
     */
    public String getLugarEdicion() {
        return lugarEdicion;
    }

    /**
     * @param lugarEdicion the lugarEdicion to set
     */
    public void setLugarEdicion(String lugarEdicion) {
        this.lugarEdicion = lugarEdicion;
    }
    
    
}
