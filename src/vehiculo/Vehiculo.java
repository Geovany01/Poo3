
package vehiculo;

abstract public class Vehiculo {
    private String marca, modelo, color, matricula;
    private double precio;
    public Vehiculo() {
        
    }

    public Vehiculo(String marca, String modelo, String color, String matricula, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.matricula = matricula;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void getMatricula(String matrícula) {
        this.matricula = matrícula;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void arrancar() {
        
    }
    
    public void acelerar() {
        
    }
    
    public void detenerse() {
        
    }
    
}
