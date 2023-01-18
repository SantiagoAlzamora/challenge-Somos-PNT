/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package challengepnt.entities;

/**
 *
 * @author santi
 */
public final class Higiene extends Producto{
    
    private Integer contenido;

    public Higiene() {
        super();
    }

    public Higiene(String nombre, Integer contenido, Double precio) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    public Integer getContenido() {
        return contenido;
    }

    public void setContenido(Integer contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return super.toString()+ "Contenido= " + contenido + "ml /// Precio= $"+ super.precio;
    }
    
    
    
}
