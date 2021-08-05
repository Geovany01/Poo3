
package vehiculo.terrestre;

import vehiculo.terrestre.VehiculoTerrestre;

public class Automovil extends VehiculoTerrestre{
    private String cantPuertas;
    
    public Automovil() {
        
    }

    public Automovil(String cantPuertas, String cantRuedas, String marca, String modelo, String color, String matricula, double precio) {
        super(cantRuedas, marca, modelo, color, matricula, precio);
        this.cantPuertas = cantPuertas;
    }

    public String getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(String cantPuertas) {
        this.cantPuertas = cantPuertas;
    }
    
    @Override
    public void girarDerecha() {
        
    }
    
    @Override
    public void girarIzqierda() {
        
    }
    
    @Override
    public void cambioDeVelocidad() {
        
    }
    
    protected void retroceder() {
        
    }
    
    public void mostrarDetalles() {
        System.out.println("Marca = " + getMarca());
        System.out.println("Modelo = " + getModelo());
        System.out.println("Color = " + getColor());
        System.out.println("Matrícula = " + getMatricula());
        System.out.println("Precio = " + getPrecio());
        System.out.println("Cantidad de Puertas = " + getCantPuertas());
        System.out.println("Cantidad Ruedas = " + getCantRuedas());
    }
}
