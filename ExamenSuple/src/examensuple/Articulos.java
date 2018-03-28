
package examensuple;


public class Articulos {
    
    private String claveArticulo;
    private String nombre;
    private int precio;
    private String claveFabricante;
    private String nombreFabricante;
    

    public Articulos() {
    }

    public Articulos(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Articulos(String claveArticulo, String nombre, int precio, String claveFabricante, String nombreFabricante) {
        this.claveArticulo = claveArticulo;
        this.nombre = nombre;
        this.precio = precio;
        this.claveFabricante = claveFabricante;
        this.nombreFabricante = nombreFabricante;
    }

    public String getClaveArticulo() {
        return claveArticulo;
    }

    public void setClaveArticulo(String claveArticulo) {
        this.claveArticulo = claveArticulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getClaveFabricante() {
        return claveFabricante;
    }

    public void setClaveFabricante(String claveFabricante) {
        this.claveFabricante = claveFabricante;
    }

    public String getNombreFabricante() {
        return nombreFabricante;
    }

    public void setNombreFabricante(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }

  
    

    

    
    
    
    
    
    
}
