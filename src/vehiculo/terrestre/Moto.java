
package vehiculo.terrestre;

import vehiculo.terrestre.VehiculoTerrestre;

public class Moto extends VehiculoTerrestre{
    private String proposito; //único o doble propósito
    
    public Moto() {
        
    }

    public Moto(String proposito, String cantRuedas, String marca, String modelo, String color, String matricula, double precio) {
        super(cantRuedas, marca, modelo, color, matricula, precio);
        this.proposito = proposito;
    }

    public String getProposito() {
        return proposito;
    }

    public void setProposito(String proposito) {
        this.proposito = proposito;
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
    
    public void mostrarDetalles() {
        System.out.println("Marca = " + getMarca());
        System.out.println("Modelo = " + getModelo());
        System.out.println("Color = " + getColor());
        System.out.println("Matrícula = " + getMatricula());
        System.out.println("Precio = " + getPrecio());
        System.out.println("Propósito (único o doble propósito) = " + getProposito());
        System.out.println("Cantidad Ruedas = " + getCantRuedas());
    }
}
