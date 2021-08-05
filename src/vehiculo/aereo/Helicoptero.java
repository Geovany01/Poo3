
package vehiculo.aereo;

public class Helicoptero extends VehiculoAereo{
    private String cantHelices;
    
    public Helicoptero() {
        
    }

    public Helicoptero(String cantHelices, String cantRuedasTrenAterrizaje, String marca, String modelo, String color, String matricula, double precio) {
        super(cantRuedasTrenAterrizaje, marca, modelo, color, matricula, precio);
        this.cantHelices = cantHelices;
    }

    public String getCantHelices() {
        return cantHelices;
    }

    public void setCantHelices(String cantHelices) {
        this.cantHelices = cantHelices;
    }
    
    @Override
    public void girarDerecha() {
        
    }
    
    @Override
    public void girarIzqierda() {
        
    }
    
    @Override
    public void arriba() {
        
    }
    
    @Override
    public void abajo() {
        
    }
    
    public void mostrarDetalles() {
        System.out.println("Marca = " + getMarca());
        System.out.println("Modelo = " + getModelo());
        System.out.println("Color = " + getColor());
        System.out.println("Matrícula = " + getMatricula());
        System.out.println("Precio = " + getPrecio());
        System.out.println("Cantidad de Hélices = " + getCantHelices());
        System.out.println("Cantidad Ruedas del Tren de Aterrizaje = " + cantRuedasTrenAterrizaje());
    }
}
