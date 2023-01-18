/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package challengepnt.entities;

/**
 *
 * @author santi
 */
public final class Fruta extends Producto{
   
    private String unidadDeVenta;

    public Fruta() {
        super();
    }

    public Fruta(String nombre, String unidadDeVenta, Double precio) {
        super(nombre, precio);
        this.unidadDeVenta = unidadDeVenta;
    }

    public String getUnidadDeVenta() {
        return unidadDeVenta;
    }

    public void setUnidadDeVenta(String unidadDeVenta) {
        this.unidadDeVenta = unidadDeVenta;
    }
    
    @Override
    public String toString() {
        return super.toString()+ "Precio= $"+ super.precio + " /// Unidad de venta= " + unidadDeVenta ;
    }

}
