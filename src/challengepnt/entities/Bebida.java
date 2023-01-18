/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package challengepnt.entities;

/**
 *
 * @author santi
 */
public final class Bebida extends Producto{
    
    private Double litros;

    public Bebida() {
        super();
    }

    public Bebida( String nombre, Double litros, Double precio) {
        super(nombre, precio);
        this.litros = litros;
    }

    public Double getLitros() {
        return litros;
    }

    public void setLitros(Double litros) {
        this.litros = litros;
    }
    
    @Override
    public String toString() {
        return super.toString()+ "Litros= " + litros + " /// Precio= $"+ super.precio;
    }

}
