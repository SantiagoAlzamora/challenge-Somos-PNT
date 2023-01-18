/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package challengepnt.entities;

/**
 *
 * @author santi
 */
public class Producto implements Comparable<Producto>{
    
    protected String nombre;
    protected Double precio;

    public Producto() {
    }

    public Producto(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Nombre= " + nombre + " /// ";
    }

    @Override
    public int compareTo(Producto o) {
        return this.precio.compareTo(o.getPrecio());
    }
    
    
    
}
