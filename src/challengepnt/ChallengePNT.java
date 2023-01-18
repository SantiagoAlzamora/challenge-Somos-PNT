package challengepnt;

import challengepnt.entities.Producto;
import challengepnt.services.ProductService;
import java.util.List;

/**
 * Ejercicio Escuelita Somos PNT Realizado por Santiago Alzamora
 *
 *
 * Imaginemos un supermercado de barrio.
 *
 *
 * Crear un programa cuyo punto de entrada sea un main en donde, al ejecutarse,
 * se visualiza lo siguiente por consola y se termina la ejecución:
 *
 *
 *
 * Nombre: Coca-Cola Zero /// Litros: 1.5 /// Precio: $20
 *
 * Nombre: Coca-Cola /// Litros: 1.5 /// Precio: $18
 *
 * Nombre: Shampoo Sedal /// Contenido: 500ml /// Precio: $19
 *
 * Nombre: Frutillas /// Precio: $64 /// Unidad de venta: kilo
 *
 * =============================
 *
 * Producto más caro: Frutillas
 *
 * Producto más barato: Coca-Cola
 *
 *
 * La solución debe cumplir con los siguientes requisitos:
 *
 * Diseñar una solución orientada a objetos. La salida es por consola y
 * exactamente como se requiere. Usar solamente las clases provistas por Java
 * 8.. Cargar la lista de productos en un único método. No hay ingreso por
 * pantalla de ningún tipo. El algoritmo usado para la impresión no tiene que
 * depender de la cantidad o tipo de productos. Para mostrar el mayor / menor,
 * utilizar la interfaz Comparable. Para imprimir por pantalla, sobrescribir el
 * método toString()
 */
/**
 *
 * @author santi
 */
public class ChallengePNT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ProductService productService = new ProductService();

        List<Producto> productList = productService.loadProducts();
        productService.showProducts(productList);
        productService.getMaxPriceAndMinPrice(productList);
    }

}
