
package vehiculo.aereo;

public class Avion extends VehiculoAereo{
    private String cantTurbinas;
    
    public Avion() {
        
    }

    public Avion(String cantTurbinas, String cantRuedasTrenAterrizaje, String marca, String modelo, String color, String matricula, double precio) {
        super(cantRuedasTrenAterrizaje, marca, modelo, color, matricula, precio);
        this.cantTurbinas = cantTurbinas;
    }

    public String getCantTurbinas() {
        return cantTurbinas;
    }

    public void setCantTurbinas(String cantTurbinas) {
        this.cantTurbinas = cantTurbinas;
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
        System.out.println("Cantidad de Turbinas = " + getCantTurbinas());
        System.out.println("Cantidad Ruedas del Tren de Aterrizaje = " + cantRuedasTrenAterrizaje());
    }
}
