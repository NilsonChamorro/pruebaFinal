package modelo;

public class gaseosa {

    private Integer ID;
    private String sabor;
    private Integer litros;
    private String envase;
    private Integer precio;
    private Integer cantidad;
    private marcas marck;

    public gaseosa() {
    }

    public gaseosa(Integer ID, String sabor, Integer litros, String envase, Integer precio, Integer cantidad, marcas marca) {
        this.ID = ID;
        this.sabor = sabor;
        this.litros = litros;
        this.envase = envase;
        this.precio = precio;
        this.cantidad = cantidad;
        this.marck = marca;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public Integer getLitros() {
        return litros;
    }

    public void setLitros(Integer litros) {
        this.litros = litros;
    }

    public String getEnvase() {
        return envase;
    }

    public void setEnvase(String envase) {
        this.envase = envase;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public marcas getMarck() {
        return marck;
    }

    public void setMarck(marcas marck) {
        this.marck = marck;
    }

    @Override
    public String toString() {
        return ID + " - " + sabor;
    }

}
