
package vehiculo.aereo;
import vehiculo.Vehiculo;

public class VehiculoAereo extends Vehiculo{
    private String cantRuedasTrenAterrizaje;
    
    public VehiculoAereo() {
        
    }

    public VehiculoAereo(String cantRuedasTrenAterrizaje, String marca, String modelo, String color, String matrícula, double precio) {
        super(marca, modelo, color, matrícula, precio);
        this.cantRuedasTrenAterrizaje = cantRuedasTrenAterrizaje;
    }

    public String cantRuedasTrenAterrizaje() {
        return cantRuedasTrenAterrizaje;
    }

    public void setCantRuedas(String cantRuedasTrenAterrizaje) {
        this.cantRuedasTrenAterrizaje = cantRuedasTrenAterrizaje;
    }
    
    protected void girarDerecha() {
        
    }
    
    protected void girarIzqierda() {
        
    }
    
    protected void arriba() {
        
    }
    
    protected void abajo() {
        
    }
    
}
