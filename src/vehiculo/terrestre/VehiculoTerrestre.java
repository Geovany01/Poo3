
package vehiculo.terrestre;

import vehiculo.Vehiculo;

public class VehiculoTerrestre extends Vehiculo{
    private String cantRuedas;
    
    public VehiculoTerrestre() {
        
    }

    public VehiculoTerrestre(String cantRuedas, String marca, String modelo, String color, String matricula, double precio) {
        super(marca, modelo, color, matricula, precio);
        this.cantRuedas = cantRuedas;
    }

    public String getCantRuedas() {
        return cantRuedas;
    }

    public void setCantRuedas(String cantRuedas) {
        this.cantRuedas = cantRuedas;
    }
    
    protected void girarDerecha() {
        
    }
    
    protected void girarIzqierda() {
        
    }
    
    protected void cambioDeVelocidad() {
        
    }
    
}
